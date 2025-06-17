// This becomes a pipeline step you can call directly
def call(String name) {
    echo "Hello, ${name}!"
    def util = new com.example.MathUtil()
    echo "Random lucky number: ${util.getRandomNumber()}"
    
    // Using a resource file
    def message = libraryResource 'messages/welcome.txt'
    echo message
}
