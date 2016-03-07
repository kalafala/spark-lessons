val x=sc.parallelize(Array("a","b","c"));
val y = x.map(z=>(z,1));
println(x.collect.mkString(", "));
println(y.collect.mkString(", "));

