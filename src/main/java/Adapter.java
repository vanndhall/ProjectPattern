public class Adapter implements NewSystemPerson {
    private OldSystemPerson oldSystemPerson;

    public Adapter(OldSystemPerson oldSystemPerson) {
        this.oldSystemPerson = oldSystemPerson;
    }

    @Override
    public String getFirstName() {
        final String[] split = oldSystemPerson.getName().split("[\\t ]");
        if(split.length<1){
            return"";
        }
        return split[0];
    }

    @Override
    public String getLastName() {
        final String[] split = oldSystemPerson.getName().split("[\\t ]");
        if(split.length<2){
            return"";
        }
        char[] chars = split[1].toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);
        return new String(chars);
    }
}
