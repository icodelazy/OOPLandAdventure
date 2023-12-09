public class Mage extends OOPLander implements Skill, Replenish {
    private static final int MAX_MANA = 120;
    public static final String LOW_MANA = "not enough mana";
    private int mana;

    @Override
    public void castSpell(int manaToSpend) {
        if (10 < mana && mana > manaToSpend) {
            this.mana -= manaToSpend;
            System.out.println("Spell Casted...!!!");
        }
        System.out.println(LOW_MANA);
    }

    @Override
    public void fight(int manaToSpend) {
        if (10 < mana && mana > manaToSpend)
            this.mana -= manaToSpend;
        System.out.println(LOW_MANA);
    }

    @Override
    public void defend(int manaToSpend) {
        if (10 < mana && mana > manaToSpend)
            this.mana -= manaToSpend;
        System.out.println(LOW_MANA);
    }

    @Override
    public void restAndReplenish() {
        while (MAX_MANA > mana) {
            this.mana += 1;
        }
    }
}
