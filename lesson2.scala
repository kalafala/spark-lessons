/** Examples from "Learning Spark" https://www.safaribooksonline.com/library/view/Learning+Spark/9781449359034/ch03.html#chapid_programming_with_rdds */

val inputRDD = sc.textFile("data/logFile");
val warningsRDD = inputRDD.filter(line => line.contains("(W)"));
val errorsRDD = inputRDD.filter(line => line.contains("(E)"));
val concernsRDD = errorsRDD.union(warningsRDD);

println("Input had " + inputRDD.count() + " lines");
println("Of these " +warningsRDD.count() + " were warnings");
println("Of these " +errorsRDD.count() + " were errors");
println("For a total of " +concernsRDD.count() + " concerning lines");

println("Here are several examples:");
concernsRDD.take(100).foreach(println);
