package sk.gabrielkostialik.coctails.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "t_cocktails", schema = "co")
public class TCocktail implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "t_cocktail_seq")
    @SequenceGenerator(name = "t_cocktail_seq", sequenceName = "co.t_cocktails_cocktail_id_seq", allocationSize = 1, initialValue = 0)
    @Column(name = "cocktail_id", nullable = false)
    private Long cocktailId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "url", nullable = false)
    private String url;

    public TCocktail() {
    }

    public Long getCocktailId() {
        return cocktailId;
    }

    public void setCocktailId(Long cocktailId) {
        this.cocktailId = cocktailId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
