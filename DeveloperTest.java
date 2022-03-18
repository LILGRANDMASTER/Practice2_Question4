public class DeveloperTest {

    public static void main(String[] args) {
        DeveloperFabric fabric = new DeveloperFabric();
        Developer dev1 = fabric.makeDeveloper(DeveloperType.Java);
        Developer dev2 = fabric.makeDeveloper(DeveloperType.Python);

        dev1.writeCode();
        dev2.writeCode();

    }
}
