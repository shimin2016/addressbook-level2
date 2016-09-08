package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;

public class Tagging {
    
    private static final String ACCTION_ADD = "+";
    private static final String ACCTION_REMOVE = "-";
    
    public static enum Action{
        ADD, REMOVE
    }
    
    private Action action;
    private Person person;
    private Tag tag;
    
    public Tagging(Action action, Person person, Tag tag) {
        this.action = action;
        this.person = person;
        this.tag = tag;
    }
    
    /*
     * change the tagging if person removed
     */
    public void changeTagging() {
        this.action = (this.action == Action.ADD) ? Action.REMOVE : Action.ADD;
    }
    
    public Tag getTag(){
        return this.tag;
    }
    
    public Person getPerson() {
        return this.person;
    }

    @Override
    public String toString() {
        return (this.action == Action.ADD) ? ACCTION_ADD : ACCTION_REMOVE + " " + this.person.getName()
                                + " " + this.tag;
    }
}
