package DoitAlgorithm.Complete.chap03;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class GenericClassTester {
    // 제네릭 클래스의 매개변수를 T라고 작성함
    static class GenericClass<T>{
        private T xyz;
        GenericClass(T t){   // 생성자
            this.xyz = t;
        }
        T getXyz(){            // xyz getter
            return xyz;
        }
    }

    public static void main(String[] args) {
        //  다음과 같이 매개변수에 String 을 넘길 수 도 있고 Integer를 넘길 수 도 있음
        GenericClass<String> s = new GenericClass<String>("ABC");
        GenericClass<Integer> n = new GenericClass<Integer>(15);

        System.out.println(s.getXyz());
        System.out.println(n.getXyz());
    }
}
