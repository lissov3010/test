public class Worker {

    String name;
    String post;
    int salary;

    Worker( String name , String post , int salary ) {
        this.name = name;
        this.post = post;
        this.salary = salary;
    }

    String infoWorker( int month) {

        return " Имя: " + name + " . Должность: " + post + " . За последние :" + month + " Месяцев получил " + month * salary + " Рублей . ";
    }

}
