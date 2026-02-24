import java.util.Random;
public class tigrinho {
    public  void girar (int x) {
        Random aleatorio = new Random();
        int num = aleatorio.nextInt(22);
        if (x == num) {
            IO.println("Número sorteado:" + num);
            IO.println("Parabéns você ganhou 100,00 R$!!!");
        }
        else{
            IO.println("Número sorteado:" + num);
            IO.println("Não foi dessa vez!");
        }

    }
}