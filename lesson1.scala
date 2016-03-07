/** Simple map example */
val x=sc.parallelize(Array("a","b","c"));
val y = x.map(z=>(z,1));
println(x.collect.mkString(", "));
println(y.collect.mkString(", "));

/** Simple filter example, transformed RDD zz should have only odd elements */
val z = sc.parallelize(Array(1, 2, 3));
val zz = z.filter(n=> n%2 == 1);
println(z.collect().mkString(", "));
println(zz.collect().mkString(", "));
