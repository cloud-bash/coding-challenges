def calculate_frequencies(file_contents):
    # Here is a list of punctuations and uninteresting words you can use to process your text
    punctuations = '''!()-[]{};:'"\,<>./?@#$%^&*_~'''
    uninteresting_words = ["the", "a", "to", "if", "is", "it", "of", "and", "or", "an", "as", "i", "me", "my", \
    "we", "our", "ours", "you", "your", "yours", "he", "she", "him", "his", "her", "hers", "its", "they", "them", \
    "their", "what", "which", "who", "whom", "this", "that", "am", "are", "was", "were", "be", "been", "being", \
    "have", "has", "had", "do", "does", "did", "but", "at", "by", "with", "from", "here", "when", "where", "how", \
    "all", "any", "both", "each", "few", "more", "some", "such", "no", "nor", "too", "very", "can", "will", "just"]
    
    # LEARNER CODE START HERE

    #create dictionary to hold word(key) and frequency(value)
    frequencies = {}
    
    #mockData to test my work
    mockString = """Strings strings strings in the earth and air
     Make music sweet;

     II  	The twilight turns from amethyst
     To deep and deeper blue,"""
    
    #transform whole string to lowercase
    #mockString = mockString.lower()
    file_contents = file_contents.lower()
    
    #remove punctuations
    for char in file_contents:
        if char in punctuations:
            file_contents = file_contents.replace(char,"")
            
    #make the string a list of words that don't match any uninteresting words
    wordList = [word for word in file_contents.split() if word not in uninteresting_words]
    
    #count the words and put them in the frequency dictionary
    for word in wordList:
        if word not in frequencies.keys():
            frequencies[word]=1
        else:
            frequencies[word]+=1
    
    #print(frequencies)
    
    #wordcloud
    cloud = wordcloud.WordCloud()
    cloud.generate_from_frequencies(frequencies)
    return cloud.to_array()
