# オブジェクト指向

- [オブジェクト指向](#オブジェクト指向)
  - [Specific data](#specific-data)
  - [複数人のデータ](#複数人のデータ)
  - [ポリモーフィズム](#ポリモーフィズム)
    - [PlantUML](#plantuml)
      - [クラス図](#クラス図)
    - [Java ソースコード](#java-ソースコード)
      - [Mainクラス](#mainクラス)
      - [Actionsクラス](#actionsクラス)
      - [Vehicleインターフェース](#vehicleインターフェース)
      - [Carクラス](#carクラス)
      - [Trainクラス](#trainクラス)

## Specific data

```Java

//Code language
String codeName = "Java";
//Frameworks
String frameworkName = "Springboot";
//Class
Int age = 26;

//フルネームを表示
System.out.println(codeName + ": " + frameworkName);

```

実行結果

```Java

Java: Springboot

```

## 複数人のデータ

```Java

String[] codeNames = ["Java", "HTML+CSS", "Discode"];
String[] frameworkNames = ["Springboot", "React, Redux", "Python"];
Integer[] class = [26, 43, 46];

//全員のフルネームを繰り返し処理を使って表示
for (Integer i = 0; i < 3; i++>){
    System.out.println(codeNames[i] + ": " + frameworkNames[i]);
}

```

実行結果

```Java

Java: Springboot
HTML+CSS: React, Redux
Discode: Python

```

## ポリモーフィズム

### PlantUML

#### クラス図

![クラス図 ポリモーフィズム](https://github.com/holangi-08/documents/blob/main/pictures/polymorphism.PNG)

```PlantUML

@startuml
title Polymorphism example

interface Vechle {
___
    +void run()
    +void stop()
}

class Car {
___
    +void run()
    +void stop()
}

class Train {
    +void run()
    +void stop()
}

class Main {
    +{static} main(String[] args)
}

class Actions {
     +void execute(Vechle)
}

Car .up.|> Vechle
Train .up.|> Vechle
Main -left- Vechle : use >
Main -left- Car : use >
Main -left- Train : use >
Main -left- Actions : use >
Actions -down- Vechle : use >

@enduml

```

### Java ソースコード

#### Mainクラス

```Java

public class Main {

  public static void main(String[] args) {
      List<Vechle> vechles = new ArrayList<Vechle>();
      vechles.add(new Car());
      vechles.add(new Train());
      new Actions().execute(vechles);
  }

}

```

#### Actionsクラス

```Java

public class Actions {

  public void execute(List<Vechle> vechles) {
    for (Vehicle vehicle : vehicles) {
      vehicle.run();
      vehicle.stop();
    }
  }

}

```

#### Vehicleインターフェース

```Java

public interface Vehicle {
  public void run();
  public void stop();
}

```

#### Carクラス

```Java

public class Car implements Vechle {

  public void run() {
    System.out.prinln("The car is running!");
  }
  public void stop() {
    System.out.prinln("The car stops!");
  }

}

```

#### Trainクラス

```Java

public class Train implements Vechle {

  public void run() {
    System.out.println("Train is moving");
  }
  public void stop() {
    System.out.println(Train is crashed);
  }

}

```