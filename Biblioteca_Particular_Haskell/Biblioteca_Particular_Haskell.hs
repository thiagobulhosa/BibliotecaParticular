import Data.List
--
epocaRetirada diaRetirada mesRetirada anoRetirada=(diaRetirada,mesRetirada,anoRetirada) -- Definição data retirada
--
epocaDevolucao diaDevolucao mesDevolucao anoDevolucao=(diaDevolucao,mesDevolucao,anoDevolucao) -- Definição data devolução
--
dataAtual diaHoje mesHoje anoHoje = (diaHoje,mesHoje,anoHoje) -- Creio que em haskell nao seja psosivel usar um horario atual, portanto defini a data como os tempos limites para devolução de cada item(valores estão na questão "h)"")
--
livro titulo autor epoca=(titulo,autor,epoca) -- b)Crie uma classe especifica para manipular livros.
--
utensilio nome descrição epoca=(nome,descrição,epoca) -- c) Crie uma classe especifica para manipular utensilios.
--
emprestimo livro utensilio epocaRetirada epocaDevolucao email = (livro, utensilio,epocaRetirada, epocaDevolucao,email) -- a) Crie uma classe especifica para manipular emprestimos
insereEmprestimo emprestimo=[emprestimo] -- g) Crie uma lista de emprestimos, a qual lista os produtos que foram emprestados / Transformar a tupla emprestimo em lista
--
atrasados listaHoje listaEntrega = (comparaEntrega listaHoje) listaEntrega
comparaEntrega (diaHoje,mesHoje,anoHoje) (diaEntrega,mesEntrega,anoEntrega) = if anoEntrega > anoHoje  
                                                                                    then "^^^^^^ATRASADO^^^^^^"
                                                                                    else if mesEntrega > mesHoje 
                                                                                        then "^^^^^^ATRASADO^^^^^^"
                                                                                        else if diaEntrega >= diaHoje+3
                                                                                            then "^^^^^^ATRASADO^^^^^^"
                                                                                            else "Nao atrasado"                                                                              
 --   
totalEmprestimo x = x+1 -- Somar todos os emprestimos
--
main = do
    --
    let emprestimosLivros=[]
    let emprestimosUtensilios=[]
    --
    let novoObjeto=[] -- Aloca um objeto qualquer (livro, frigideira etc)
    --
    let emprestimosTotais= 0 -- Numero de emprestimos totais
    let auxEmprestimosTotais= 0 -- Auxiliar numero de emprestimos totais
    --
    let emprestimos=[] -- Todos os emprestimos

    let novoObjeto=(livro "O Monge e o Executivo" "James Hunter" 2004) -- e) Crie um objeto para o livro
    let emprestimosLivros=insereEmprestimo (emprestimo novoObjeto "" (3, 1, 2014) (3, 2, 2014) "email1@hotmail.com") -- h) Adicione o livro lista de emprestimos.
    let emprestimos = atrasados (3, 1, 2014) (3, 2, 2014) -- i) percorra a lista de emprestimos e imprima
    print "Livros emprestados: "
    print emprestimosLivros
    print emprestimos 
    let emprestimosTotais = totalEmprestimo auxEmprestimosTotais
    let auxEmprestimosTotais = emprestimosTotais

    let novoObjeto=(utensilio "Frigideira" "Teflon" 2007) -- f) Crie um objeto que represente uma frigideira de teflon.
    let emprestimosUtensilios=insereEmprestimo (emprestimo "" novoObjeto (23, 12, 2013) (27, 12, 2013) "email2@hotmail.com")
    let emprestimos = atrasados (23, 12, 2013)  (27, 12, 2013) -- h) Adicione a frigideira à lista de emprestimos.
    print "Utensilios emprestados: "
    print emprestimosUtensilios
    print emprestimos -- i) percorra a lista de emprestimos e imprima
    let emprestimosTotais = totalEmprestimo auxEmprestimosTotais
    let auxEmprestimosTotais = emprestimosTotais

    print "Emprestimos totais: "
    print emprestimosTotais