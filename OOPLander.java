import java.util.Objects;

public class OOPLander {
    private String name;
    private String rank;
    private String abilities;

    public OOPLander() {
    }

    public OOPLander(String name, String rank, String abilities) {
        this.name = name;
        this.rank = rank;
        this.abilities = abilities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getAbilities() {
        return abilities;
    }

    public void setAbilities(String abilities) {
        this.abilities = abilities;
    }

    @Override
    public String toString() {
        return "OOPLander{" +
                "name='" + name + '\'' +
                ", rank='" + rank + '\'' +
                ", abilities='" + abilities + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OOPLander oopLander = (OOPLander) o;
        return Objects.equals(name, oopLander.name) && Objects.equals(rank, oopLander.rank) && Objects.equals(abilities, oopLander.abilities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rank, abilities);
    }
}
