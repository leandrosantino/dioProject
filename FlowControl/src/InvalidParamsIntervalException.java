class InvalidParamsIntervalException extends RuntimeException {
    public InvalidParamsIntervalException() {
        super("O segundo parâmetro deve ser maior que o primeiro");
    }
}