class PrimitivesAndImutableObjects {
    public static void main(String[] args) {
        // value will not change of all primitives + imutable objects
        int a = 5; 
        changePrimitiveParameter(a);
        System.out.println("global.a=" + a);
        System.out.println("--------------------");
        int[] array = {5};
        changeArray(array);
        System.out.println("global.array[0]=" + array[0]);
        System.out.println("--------------------");
        changeArrayElement(array);
        System.out.println("global.array[0]=" + array[0]);
        System.out.println("--------------------");
        String s = "Hello world";
        changeString(s);
        System.out.println("global.s=" + s);
    }

    public static void changePrimitiveParameter(int a) {
        a++;               // значение переменной изменяем только локально
        System.out.println("local.a=" + a);
    }

    public static void changeArray(int[] a) {
        a = new int[] {5}; // создаем новый массив
        a[0]++;            // изменяем новый массив
        System.out.println("local.array[0]=" + a[0]);
    }

    public static void changeArrayElement(int[] a) {
        a[0]++;            // изменяем глобальный массив
        System.out.println("local.a[0]=" + a[0]);
    }

    public static void changeString(String s) {
        s = "Hello java"; // создаем ссылку на новое значение
        System.out.println("local.s=" + s);
    }
}