var revl:List[Int] = List[Int]()

def rev(arr1:List[Int],i:Int,arr:List[Int])  {
  if (i < arr.size){
    rev(arr1, i+1,arr)
    revl = revl :+ arr(i)
  }
}

def f(arr:List[Int]):List[Int] = {
  val i:Int = 0
  rev(revl,i,arr)
  return revl
}
