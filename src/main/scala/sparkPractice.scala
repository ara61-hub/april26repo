object sparkPractice {
  abstract class mahindraCar {
    def Design();

    def enginee();

    def color() = {


    }


    class B extends mahindraCar {
      def Design() = {

        print("I am design function")
      }

      def enginee() = {
        print(" I am enginee function")
      }

    }

    def main(args: Array[String]): Unit = {
      val in = new B()
      in.enginee()
      in.Design()
      in.color()

    }
  }
}
