package home_work_8.ex1;

public enum Animals {
    DOG(5), CAT(3), RABBIT(1);
    int age;
    Animals(int vik){
        this.age = vik;
    }

    @Override
    public String toString() {
        return this.name() + " - " + this.age + " years old";
    }

    //Якщо все ж таки потрібний перевантажений метод
    public String toString(boolean allInfo) {
        if (allInfo) {
            return this.name() + " - " + this.age + " years old";
        }else {
            return this.name();
        }
    }
}

class TestEnum{
    public static void main(String[] args) {
        //використовуємо перевантажений метод toString()
        System.out.println(Animals.DOG.toString(true));
        //звичайний перезаписаний метод метод toString()
        for (Animals animal : Animals.values()) {
            System.out.println(animal);
        }
    }
}
