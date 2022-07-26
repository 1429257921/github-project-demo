package com.example.demo.design.proxy;

/**
 * 动态代理测试
 *
 * @author gzc
 * @since 2022-7-22 11:10
 **/
public class Test1 {

	/**
	 * 1、JDK动态代理具体实现原理：
	 * 通过实现InvocationHandlet接口创建自己的调用处理器；
	 * 通过为Proxy类指定ClassLoader对象和一组interface来创建动态代理；
	 * 通过反射机制获取动态代理类的构造函数，其唯一参数类型就是调用处理器接口类型；
	 * 通过构造函数创建动态代理类实例，构造时调用处理器对象作为参数参入；
	 * JDK动态代理是面向接口的代理模式，如果被代理目标没有接口那么Spring也无能为力，Spring通过Java的反射机制生产被代理接口的新的匿名实现类，重写了其中AOP的增强方法。
	 * <p>
	 * 2、CGLib动态代理：
	 * CGLib是一个强大、高性能的Code生产类库，可以实现运行期动态扩展java类，Spring在运行期间通过 CGlib继承要被动态代理的类，重写父类的方法，实现AOP面向切面编程呢。
	 * <p>
	 * 3、两者对比：
	 * JDK动态代理是面向接口的。
	 * CGLib动态代理是通过字节码底层继承要代理类来实现（如果被代理类被final关键字所修饰，那么抱歉会失败）。
	 * <p>
	 * 4、使用注意：
	 * 如果要被代理的对象是个实现类，那么Spring会使用JDK动态代理来完成操作（Spirng默认采用JDK动态代理实现机制）；
	 * 如果要被代理的对象不是个实现类那么，Spring会强制使用CGLib来实现动态代理。
	 * <p>
	 * 5、性能对比
	 * 1、CGLib所创建的动态代理对象在实际运行时候的性能要比JDK动态代理高不少，有研究表明，大概要高10倍；
	 * 2、但是CGLib在创建对象的时候所花费的时间却比JDK动态代理要多很多，有研究表明，大概有8倍的差距；
	 * 3、因此，对于singleton的代理对象或者具有实例池的代理，因为无需频繁的创建代理对象，所以比较适合采用CGLib动态代理，反正，则比较适用JDK动态代理。
	 */
	public static void main(String[] args) {

		ProxyInv proxyInv = new ProxyInv(new UserDaoImpl());
		UserDao userDao = (UserDao) proxyInv.creatProxy();
		userDao.queryById("aaa");
		System.out.println("========================================");
		ProxyMethod proxyMethod = new ProxyMethod(new User111());
		User111 proxyInstance = (User111) proxyMethod.getProxyInstance();
		proxyInstance.queryById("cba");
	}

}
