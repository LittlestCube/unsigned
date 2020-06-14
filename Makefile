all:
	javac *.java

run:
	java test

clean:
	rm *.class || continue
	cd littlecube/unsigned && $(MAKE) clean
