const TestAars = require('./NativeTestAars').default;

export function multiply(a: number, b: number): number {
  return TestAars.multiply(a, b);
}
