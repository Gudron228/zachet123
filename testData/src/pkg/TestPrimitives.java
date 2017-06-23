package pkg;

public class TestPrimitives {

  public void printAll() {
    printBoolean(true);
    printByte((byte) 123);
    printShort((short) 257);
    printInt(123);
    printLong(123L);
    printFloat(1.23F);
    printDouble(1.23);
    printChar('Z');

    printBooleanBoxed(true);
    printByteBoxed((byte) 123);
    printShortBoxed((short) 257);
    printIntBoxed(1);
    printIntBoxed(40_000);
    printLongBoxed(123L);
    printFloatBoxed(1.23F);
    printDoubleBoxed(1.23);
    printCharBoxed('Z');

    System.out.printf("%b, %d, %d, %d, %c, %d", true, 1, 213, 40_000, 'c', 42L);
    System.out.printf("%b, %d, %d, %d", getBoolean(), getByte(), getShort(), getInt());

    new TestPrimitives(false, (byte) 123, (short) 257, 40_000, 123L, 3.14f, 1.618, 'A');
    new TestPrimitives('A', 1.618, 3.14f, 123L, 40_000, (short) 257, (byte) 123, false);
  }

  private TestPrimitives(boolean bool, byte b, short s, int i, long l, float f, double d, char c) {
    System.out.printf("%b, %d, %d, %d, %d, %.2f, %.2f, %c", bool, b, s, i, l, f, d, c);
  }

  private TestPrimitives(Character c, Double d, Float f, Long l, Integer i, Short s, Byte b, Boolean bool) {
    System.out.printf("%b, %d, %d, %d, %d, %.2f, %.2f, %c", bool, b, s, i, l, f, d, c);
  }

  public void printBoolean(boolean b) {
    System.out.printf("%b", b);
  }

  public void printByte(byte b) {
    System.out.printf("%d", b);
  }

  public void printShort(short s) {
    System.out.printf("%d", s);
  }

  public void printInt(int i) {
    System.out.printf("%d", i);
  }

  public void printLong(long l) {
    System.out.printf("%d", l);
  }

  public void printFloat(float f) {
    System.out.printf("%f", f);
  }

  public void printDouble(double d) {
    System.out.printf("%f", d);
  }

  public void printChar(char c) {
    System.out.printf("%c", c);
  }


  public void printBooleanBoxed(Boolean b) {
    System.out.printf("%b", b);
  }

  public void printByteBoxed(Byte b) {
    System.out.printf("%d", b);
  }

  public void printShortBoxed(Short s) {
    System.out.printf("%d", s);
  }

  public void printIntBoxed(Integer i) {
    System.out.printf("%d", i);
  }

  public void printLongBoxed(Long l) {
    System.out.printf("%d", l);
  }

  public void printFloatBoxed(Float f) {
    System.out.printf("%f", f);
  }

  public void printDoubleBoxed(Double d) {
    System.out.printf("%f", d);
  }

  public void printCharBoxed(Character c) {
    System.out.printf("%c", c);
  }


  public boolean getBoolean() {
    return false;
  }

  public byte getByte() {
    return (byte) 128;
  }

  public short getShort() {
    return (short) 32768;
  }

  public int getInt() {
    return 42;
  }

  public void printNarrowed() {
    printByte((byte)getInt());
    printShort((short)getInt());
  }

  public void constructor() {
    new Byte((byte)1);
  }

  private boolean compare(char c) {
    boolean res = (c > -1);
    res = (c > 0);
    res = (c > 1);
    res = (c > '\b');
    res = (c > '\t');
    res = (c > '\n');
    res = (c > '\f');
    res = (c > '\r');
    res = (c > ' ');
    res = (c > 'a');
    res = (c > 'Z');
    res = (c > 127);
    res = (c > 255);
    return res;
  }
}
