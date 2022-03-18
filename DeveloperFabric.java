public class DeveloperFabric {



    public Developer makeDeveloper(DeveloperType type){

        Developer developer = null;
        switch(type){
            case Java:
                developer = new JavaDeveloper(12, Developer.Level.Senior, new String[]{"Windows", "Linux", "MacOS"});
                break;
            case Python:
                developer = new PythonDeveloper(4, Developer.Level.Middle, new String[]{"Linux","MacOS","SQL"});
                break;
        }

        return developer;
    }
}
