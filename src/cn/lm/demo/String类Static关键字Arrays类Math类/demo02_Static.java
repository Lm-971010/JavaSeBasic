package cn.lm.demo.String类Static关键字Arrays类Math类;

public class demo02_Static {
    /**
     * 关于static关键字的使用，它可以用来修饰成员变量和成员方法，
     * 被修饰的成员是属于类的成员（类成员），而不单单是属于某个对象的，
     * 使用类名直接访问也可以
     * 使用该类创建的对象来调用也可以（不建议使用）
     *
     * 当static修饰成员变量时，该变量称为类变量、静态变量。
     * 该类的每个对象都共享同一个类变量的值。任何对象都可以更改该类变量的值
     * 但也可以在不创建该类的对象的情况下对类变量进行操作
     *
     *
     * 当static修饰成员方法时，该方法称为类方法，静态方法。
     * 建议使用类名来调用，而不需要创建类的对象
     *
     *
     * 被static修饰的成员可以并且建议通过类名直接访问。
     * 虽然也可以通过对象名访问静态成员，原因即多个对象均属于一个类，
     * 共享使用同一个静态成员，但是不建议，会出现警告信息。
     *
     * 	静态方法只能访问静态成员（静态变量或者静态方法），
     * 	不能使用非静态的成员。反之非静态的方法可以访问本类中的所有成员包含静态成员。
     *
     *
     * 1.类加载的时候进入到方法区即class文件加载到方法区:
     *
     * 	在方法区内存中类会把静态和非静态的成员区分放.
     *
     * 2.静态成员(静态变量和静态方法)是在方法区中，此时可以直接使用, 此时是没有该类的对象.
     *
     *   	也就是说静态方法不能访问非静态成员(成员属性 成员方法) this也不能够存在
     *
     * 3.类先加载，对象是在后来通过构造方法创建的。
     *
     * 	意味着对象存在时， 静态成员已经存在, 所以我们可以使用对象去调用静态成员.
     *
     * 核心： 是对象先存在还是静态成员先存在？
     *
     * 静态先存在，所不能非静态的成员
     *
     *
     * 小贴士
     *
     * 1. 静态成员的值随着类的加载而加载，且只加载一次 ,因此在整个内存中,只有一份数据.
     * 2. 静态成员存储于一块固定的内存区域（方法区中的静态区).  可以直接被类名调用。
     *
     * 静态代码块：定义在成员位置，使用static修饰的代码块 { }。
     *
     * 1. 位置：类中方法外。
     * 2. 执行：随着类的加载而执行且执行一次，优先于main方法和构造方法的执行。
     * 作用：给类变量/静态变量进行初始化赋值。
     *
     *
     * static 关键字，可以修饰变量、方法和代码块。在使用的过程中，其主要目的还是想在不创建对象的情况下，去调用方法。
     * */

}
