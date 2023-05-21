public class Steel extends Metal{

    Steel(){
        System.out.println("Вы создали сталь ашалеть\n");
    }
    @Override
    public int getEndurance() {
        return 50;
    }
}