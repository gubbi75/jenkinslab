for (i = 1; i<=10;++i) {
   job("job-$i") {
     shell("echo $JOB_NAME")
  }
}
