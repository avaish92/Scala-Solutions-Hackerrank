def f(arr:List[Int]):Int = {
  var sum = 0
  arr.map((a:Int) =>
  if (a % 2 != 0)  sum = sum + a)
  return sum
}
