def main():
    print("Hello World!")
    result = []
    scores = [3, 4, 21, 36, 10, 28, 35, 5, 24, 42]
    maxScore = scores[0];
    minScore = scores[0];
    maxCount = 0;
    minCount = 0;
    for score in scores:
        if score > maxScore:
            maxScore = score
            maxCount += 1
        elif score < minScore:
            minScore = score
            minCount += 1

    result.append(maxCount)
    result.append(minCount)
    return result



if __name__ == "__main__":
    main()
