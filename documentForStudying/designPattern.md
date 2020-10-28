# Design pattern

- [Design pattern](#design-pattern)
  - [Factory method pattern](#factory-method-pattern)
    - [Class diagram](#class-diagram)
      - [解説](#解説)
    - [Source code](#source-code)
      - [App class](#app-class)
      - [Shain class](#shain-class)
      - [ShainFactory class](#shainfactory-class)
      - [Eigyo class](#eigyo-class)
      - [Programmer class](#programmer-class)
      - [Hira class](#hira-class)
      - [Syunin class](#syunin-class)
      - [Kakarityou class](#kakarityou-class)
  - [Template method pattern](#template-method-pattern)
    - [Class diagram](#class-diagram-1)
    - [Source code](#source-code-1)
      - [App class](#app-class-1)
      - [Shain class](#shain-class-1)
      - [Eigyo class](#eigyo-class-1)
      - [Programmer class](#programmer-class-1)
  - [Singleton pattern](#singleton-pattern)
    - [Class diagram](#class-diagram-2)
    - [Source code](#source-code-2)

## Factory method pattern

### Class diagram

![Factory method pattern class diagram](https://github.com/holangi-08/documents/blob/main/pictures/shainClassDiagram.PNG)

```  plantuml

@startuml

class App {
    + main
}

class ShainFactory {

    + enum Gyousyu
    + enum SYakusyoku

    + Shain createShain(Gyoushu gyoushu, SYakusyoku yaku)
}

enum Gyoushu {

    EIGYO
    PROGRAMMER

}

enum SYakushoku{

    HIRA
    SYUNIN
    KAKARITYOU

}

class Eigyo {
    + mainWork()
}

class Programmer {
    + mainWork()
}

class Hira {
    + calcSalary
}

class Syunin {
    + calcSalary
}

class Kakarityou {
    + calcSalary
}

abstract Shain {

    - Yakushoku

    + mainWork()
    + work()
    + calcSalary()

}

interface Yakushoku {

    int calcSalary()

}

App --> ShainFactory: use
App --> Shain: use
App --> Gyoushu: use
App --> SYakushoku: use
Gyoushu -down-* ShainFactory
SYakushoku -down-* ShainFactory
Eigyo -up-> Gyoushu
Programmer -up-> Gyoushu
Hira -up-> SYakushoku
Syunin -up-> SYakushoku
Kakarityou -up-> SYakushoku
Hira --|> Shain
Syunin --|> Shain
Kakarityou --|> Shain
Eigyo --|> Shain
Programmer --|> Shain
Shain o-right- Yakushoku
Hira ..|> Yakushoku
Syunin ..|> Yakushoku
Kakarityou ..|> Yakushoku

@enduml

```

#### 解説

- Appクラスは、ShainFactoryクラス、列挙型のGyoushuクラス、列挙型のSYakushoku、抽象クラスのShainクラスを使用する。

- 列挙型のGyoushuクラスは、EigyoクラスとProgrammerクラスを使用する。

- 列挙型のSYakushokuクラスは、Hiraクラス、Syuninクラス、Kakarityouクラスを使用する。

- 抽象クラスのShainクラスは、Eigyoクラス、Programmerクラス、Hiraクラス、Syuninクラス、Kakarityouクラスを継承する。

- Hiraクラス、Syuninクラス、Kakarityouクラスは、Yakushokuインターフェースを具象化する。


### Source code

#### App class

```java

public class App {

    public static void main(String[] args) {

    };

};

```

#### Shain class
  
```java

public abstract class Shain {

    private int yakusyoku;

    public Shain(Yakusyoku yakusyoku) {
        this.yakusyoku = yakusyoku;
    };

    public void mainWork() {

    };

    public void work() {

    };

    public void calcSalary(){

    };
}

```

#### ShainFactory class

```java

public class ShainFactory {

    public enum Gyoushu{
        EIGYO, PROGRAMMER;
    };

    public enum Syakusyoku {
        HIRA, SYUNIN, KAKARITYOU;
    };

    public static Shain createShain(Gyoushu gyoushu, SYakusyoku yaku) {

    }; 
    
}

```

#### Eigyo class
  
```java

public class Eigyo extends Shain {

    public Eigyo(Yakusyoku yakusyoku) {
        super(yakusyoku);
    };

    public void mainWork() {

    };
}

```

#### Programmer class

```java

public class Programmer extends Shain {
    public Programme (Yakusyoku yakusyoku) {
        super(yakusyoku);
    };

    public void mainWork() {

    };
};

```

#### Hira class

```java

public class Hira implements Yakusyoku {
    public int calcSalary() {

    };
}

```

#### Syunin class

```java

public class Syunin implements Yakusyoku {
    public int calcSalary() {

    };
}

```

#### Kakarityou class

```java

public class Kakarityou implements Yakusyoku {
    public int calcSalary() {

    };
}

```

## Template method pattern

### Class diagram

![Template method pattern class diagram](https://github.com/holangi-08/documents/blob/main/pictures/templateMethodPatternClassDiagram.PNG)

```plantuml

@startuml

class App {
    + main
}

abstract Shain {

    - yakushoku
    + Shain(int yakusyoku)
    + Shain

    + {abstract}mainWork()
    + work()
    + calcSalary()

}

class Eigyo {

    + Eigyo(int yakusyoku)
    + mainWork()
}

class Programmer {
    + Programmer(int yakusyoku)
    + mainWork()
}

App -down-> Shain: use
Eigyo -up-|> Shain
Programmer -up-|> Shain


@enduml

```

### Source code

#### App class

```java

public class App {

    public static void main(String[] args) throws Exception {
        
    }
}

```

#### Shain class
  
```java

public abstract class Shain {

    private int yakusyoku;

    public Shain(int yakusyoku) {

    }

    public Shain() {

    }

    public abstract void mainWork() {

    };

    public void work() {

    };

    public void calcSalary(){

    };
}

```

#### Eigyo class

```java

public class Eigyo extends Shain {

    public Eigyo(int yakusyoku) {

    }

    public void mainWork() {

    };
}

```

#### Programmer class

```java

public class Programmer extends Shain {

    public Programmer(int yakusyoku) {

    }

    public void mainWork() {

    };
};

```

## Singleton pattern

### Class diagram

![Singleton pattern class diagram](https://github.com/holangi-08/documents/blob/main/pictures/singletonClassDiagram.PNG)

```plantuml

@startuml

class EmployeeNoGenerator {
  -{static}EmployeeNoGenerator singleton = new EmployeeNoGenerator();
  -int currentNo = 0;
  ___
  -EmployeeNoGenerator()
  +{static}EmployeeNoGenerator getInstance()
  +int generateNewNo()
  +int getCurrentNo()
}

class Main {
    +{static}main(String[])
}

Main -right-> EmployeeNoGenerator : use



@enduml

```

### Source code

```java

public class EmployeeNoGenerator {
    /** 唯一のインスタンスを持つフィールド. **/
    private static EmployeeNoGenerator shingleton = new EmployeeNoGenerator();
    /** 現在の最終従業員番号. **/
    private int currentNo = 0;

    /**
     * プライベートコンストラクタ.
     */
    private EmployeeNoGenerator() {}

    /**
     * 従業員番号生成インスタンスを取得する.
     */
    public static EmployeeNoGenerator getInstance() {
        return singleton;
    }

    public int generateNewNo() {
        currentNo++;
        return currentNo;
    }

    public int getCurrentNo() {
        return currentNo;
    }
}

public class Main {
    public static void main(String[] args) {
        int kitajimaNo = EmployeeNoGenerator.getInstance().generateNewNo();
        int katoNo = EmployeeNoGenerator.getInstance().generateNewNo();
    }
}

```
