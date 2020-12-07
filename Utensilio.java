package lp;

public class Utensilio {
    String descricao;
    String material;
    
    public Utensilio(String descricao, String material){
    this.descricao = descricao;
    this.material = material;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}

    