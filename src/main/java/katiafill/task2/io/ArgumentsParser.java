package katiafill.task2.io;

public class ArgumentsParser {
    private final String inputFileName;
    private final OutputType outputType;
    private final String outputFileName;

    public ArgumentsParser(String[] args) throws IllegalArgumentException {
        if (args.length < 1) {
            throw new IllegalArgumentException("Invalid command arguments. Should be input filename.");
        }

        inputFileName = args[0];

        if (args.length == 1) {
            outputType = OutputType.CONSOLE;
            outputFileName = null;
        } else {
            outputType = OutputType.getType(args[1]);
            if (outputType == null) {
                throw new IllegalArgumentException("Invalid command arguments. Should be -c or -f.");
            }

            if (outputType == OutputType.FILE) {
                if (args.length == 3) {
                    outputFileName = args[2];
                } else {
                    throw new IllegalArgumentException("Invalid command arguments. After command -f should be output filename.");
                }
            } else {
                outputFileName = null;
            }
        }

    }

    public String getInputFileName() {
        return inputFileName;
    }

    public OutputType getOutputType() {
        return outputType;
    }

    public String getOutputFileName() {
        return outputFileName;
    }
}
