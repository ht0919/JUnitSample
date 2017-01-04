# コマンドラインによるJUnitの実行サンプル

## 必要なファイル
- junit.jar
- hamcrest-core.jar
* [入手先:Download and Install](https://github.com/junit-team/junit4/wiki/Download-and-Install)

## テスト対象のクラス(Sample.java)
```
public class Sample {
	public int add(int a, int b) {
		return a + b;
	}
	public int sub(int a, int b) {
		return a - b;
	}
	public int mul(int a, int b) {
		return a * b;
	}
	public int div(int a, int b) {
		return a / b;
	}
}
```

## テストを実行するクラス(SampleTest.java)
```
import junit.framework.*;
public class SampleTest extends TestCase {
	public SampleTest(String s) {
		super(s);
	}
	public void test() throws Exception {
		Sample inst = new Sample();
		int add = inst.add(10,2);
		int sub = inst.sub(10,2);
		int mul = inst.mul(10,2);
		int div = inst.div(10,2);
		assertEquals(12, add);
		assertEquals( 8, sub);
		assertEquals(20, mul);
		assertEquals( 5, div);
	}
}
```

### macOSでの実行手順(test_mac.sh)
```
javac Sample.java
javac -cp junit-4.12.jar:. SampleTest.java
java -cp junit-4.12.jar:hamcrest-core-1.3.jar:. org.junit.runner.JUnitCore SampleTest
```

### Windowsでの実行手順(test_win.bat)
```
javac Sample.java
javac -cp junit-4.12.jar;. SampleTest.java
java -cp junit-4.12.jar;hamcrest-core-1.3.jar;. org.junit.runner.JUnitCore SampleTest
```
