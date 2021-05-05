public class Person {
    private final boolean man;
    private final String name;
    private Person spouse;

    public Person(boolean man, String name) {
        this.man = man;
        this.name = name;
    }

    /**
     * This method checks gender of persons. If genders are not equal - tries to marry.
     * If one of them has another spouse - execute divorce(sets spouse = null for husband and wife. Example: if both persons have spouses - then divorce will set 4 spouse to null) and then executes marry().
     * @param person - new husband/wife for this person.
     * @return - returns true if this person has another gender than passed person and they are not husband and wife, false otherwise
     */

    public boolean marry(Person person) {

        if (this.man == person.man) {
            return false;
        } else {

            // Если нет супругов у обоих
            if (this.spouse == null && person.spouse == null){
                this.spouse = person;
                person.spouse = this;
                return true;
            } else {
                // Развод и девичья фамилия

                if (this.spouse != person){
                    // Развести 4 человек
                    this.divorce();
                    person.divorce();
                    //this.spouse.divorce();
                    //person.spouse.divorce();
                } else {
                    // Развести эту парочку, чтобы потом опять женить
                    this.divorce();
                    person.divorce();
                }
            }
            this.marry(person);
            return true;
        }
    }


    /**
     * Sets spouse = null if spouse is not null
     * @return true - if person status has been changed
     */
    public boolean divorce() {
        if (this.spouse != null) {
            this.spouse.spouse = null;
            this.spouse = null;
            return true;
        } else {
            return false;
        }
    }
}
