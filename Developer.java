public abstract class Developer {
    public enum Level{
        Junior, Middle, Senior
    }

    public abstract void writeCode();
    public abstract void printInfo();

    public int workExperience;
    public Level level;
    public String[] techSet;
}

