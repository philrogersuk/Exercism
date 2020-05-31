class ReverseString {

    //Note - I don't think this is what the exercise is really looking for,
    //but why re-invent the wheel?
    String reverse(String inputString) {
        return new StringBuilder(inputString)
                .reverse()
                .toString();
    }
}
