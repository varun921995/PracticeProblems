
function matchValues(userId1, userId2, p){
    let i = 0 ;
    let j = 0;
    let fmap2 = calculateFrequency(userId2);
    let fmap1 ;
    let uId = [];
    let count = 0;
    while(i < userId1.length){
        j = i;
        let flag = true;
        for(let j = i ; j < userId1.length ; j++){
            uId.push(userId1[j]);
            if(uId.length === userId2.length){
                fmap1 = calculateFrequency(uId.join(""));
                if(fmap1.length === fmap2.length){
                    for (const [key, value] of Object.entries(fmap1))
                        if(key in fmap2){
                            if (fmap2[key] !== fmap1[key]) {
                                flag = false;
                                break;
                            }
                        }
                    if(flag){
                        count++;
                    }
                }
                uId = [];
                break;
            }

            j= j+p-1;
        }

        i++;
    }

    return count;

}

function calculateFrequency(s){

    return s.split('').reduce((total, letter) => {
        total[letter] ? total[letter]++ : total[letter] = 1;
        return total;
    }, {});
};


console.log(matchValues("aabbcc", "abc", 2));