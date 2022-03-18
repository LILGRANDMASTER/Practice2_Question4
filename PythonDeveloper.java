public class PythonDeveloper extends Developer{


    public PythonDeveloper(int workExperience, Level level, String[] techSet){
        this.workExperience = workExperience;
        this.level = level;
        this.techSet = techSet;
    }


    public void writeCode(){
        System.out.println("Python developer is writing code");
        printInfo();
    }
    public void printInfo(){
        System.out.println("Im Python developer");

        switch(level){
            case Junior:
                System.out.println("My level is Junior");
                break;
            case Middle:
                System.out.println("My level is Middle");
                break;
            case Senior:
                System.out.println("My level is Senior");
                break;
        }
        System.out.println("My technologies:");

        for(int i = 0; i<techSet.length; i++)
            System.out.println(techSet[i] + " ");

    }
}
