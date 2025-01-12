package curso1.aula2;

public class ConverterGraus {
    /*MEU CODIGO
  public static void main(String[] args) {
       double temperaturaCelsius = 25.5;
       double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;
       System.out.printf("O valor da temperatura em Ceusius convertida para Fahrenheit é de " + temperaturaFahrenheit);
}*/

//    CODIGO CORRETO
    public static void main(String[] args) {
        double temperaturaEmCelsius = 30.4;
        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;

        String mensagem = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit", temperaturaEmCelsius, temperaturaEmFahrenheit);

        System.out.println(mensagem);

        int temperaturaEmFahrenheitInteira = (int) temperaturaEmFahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaEmFahrenheitInteira);

    }
}
