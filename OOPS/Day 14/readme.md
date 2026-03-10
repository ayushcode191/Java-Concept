1. Object refernce take 4 bytes in memory and stored in stack memory.

2. Object heap memory me store hoga

Object Size = Header size + Exact fields + padding

1. Header (Object Hadder) = Meta Data (Mark words(lock,synchronization,garbage collection) 8 byte + class pointer(refernce store) 4 byte or 8 byte). = 12 bytes
2. Exact Data => name 4 + age 4 + rollNo 4 + collegeName 4 = 16 bytes
3. padding => java me every object 8 bytes ke multiple me le because chunk me aati memory jo padding add karne par ban jati hai.
// 12+16 = 28 => 32 bytes => 4 bytes of padding.

# call by value and call by reference

1. Java is call by value not call by reference
for both primitive and non primitive (usme refenrence copy hpta hai jisse usi object ko copy arta hai)



