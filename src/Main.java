public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();

        // Пример из задания: рост 1.87 м, вес 98 кг → ожидаем 28
        double weight = 91.0;
        double height = 1.87;

        int bmi = bmiService.calculate(weight, height);

        //  Менее 16,0	    Выраженный дефицит массы тела
        //  16,0–18,4	    Недостаточная масса тела (умеренный дефицит)
        //  18,5–24,9	    Нормальная масса тела
        //  25,0–29,9	    Избыточная масса тела (предожирение)
        //  30,0–34,9	    Ожирение I степени
        //  35,0–39,9	    Ожирение II степени
        //  40,0 и более	Ожирение III степени (морбидное)

        System.out.println("Вес: " + weight + " кг");
        System.out.println("Рост: " + height + " м");
        System.out.println("BMI: " + bmi);

    }
}
