public class Sword<T extends Metal> {
    T Material;


    Sword (T m) {
        Material = m;
        System.out.println("Вы создали меч с прочностью " + Material.getEndurance() + " не могу поверить\n");
    }

    public void Test() {
        if (Material.getEndurance() < 49) System.out.println("Меч сломался в неравном бою с хлебом... \n" +
                "Из чего ты его вообще делал???\n");
        else System.out.println("Нуууууу... \nНормально так хлеб режет..\n");
    }
}