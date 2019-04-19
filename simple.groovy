for (i = 1; i<=10;++i) {
   job("job-$i") {
      steps {
        shell('echo $JOB_NAME')
      }
  }
}
