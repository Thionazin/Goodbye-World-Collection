goodbye <- "Goodbye World"
goodbye
p1 <- proc.time()
Sys.sleep(2)
proc.time() - p1
path <- dirname(sys.frame(1)$ofile)
filee <- paste(path, "/no.R", sep="")
if(file.exists(filee))
  file.remove(filee)