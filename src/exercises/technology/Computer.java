package exercises.technology;

public class Computer extends AbstractEntity{

    // computer is my parent class

    private int ram;
    private int storage;
    private boolean hasKeyboard;

    public Computer(int storage, int ram, boolean hasKeyboard) {
        super();
        this.ram = ram;
        this.storage = storage;
        this.hasKeyboard = hasKeyboard;
    }

    public void increaseRAM (int n) {
        this.ram = this.ram + n;
    }

    public void increaseStorage (int x) {
        this.storage = this.storage + x;
    }

    //Getters and Setters

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public boolean isHasKeyboard() {
        return hasKeyboard;
    }

    public void setHasKeyboard(boolean hasKeyboard) {
        this.hasKeyboard = hasKeyboard;
    }
}