//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);
    tigrinho resultado = new tigrinho();
    IO.println("Escolha qual jogo você quer jogar: ");
    IO.println(" 1- Tigrinho");
    IO.println(" 2- OUTRO");
    IO.println();
    int escolha = sc.nextInt();
    switch (escolha){
        case 1:
            IO.println("TIGRINHO");
            IO.println("Escolha o número que você quer apostar (0-21):");
            int aposta = sc.nextInt();
            resultado.girar(aposta);
            break;
        case 2:
            IO.println("OUTRO");
            break;


    }


}
