# Welcome to "Later" EN/BG
Wlcome to "Later", a pet-project with microservicies, kafka, AmazonS3, PostgeSQL and a little bit of compler magic)))
This is my pet-project an app called "Later" (an Pastebin app). In this app users can store a url or simple text. At curent stage it consits of two microservicies "User-items-service"(for CRUD operations) and "Notification-service"(to send notifications via email using Google smtp)

```
LaterApp_local
├─ .git
│  ├─ COMMIT_EDITMSG
│  ├─ config
│  ├─ description
│  ├─ FETCH_HEAD
│  ├─ HEAD
│  ├─ hooks
│  │  ├─ applypatch-msg.sample
│  │  ├─ commit-msg.sample
│  │  ├─ fsmonitor-watchman.sample
│  │  ├─ post-update.sample
│  │  ├─ pre-applypatch.sample
│  │  ├─ pre-commit.sample
│  │  ├─ pre-merge-commit.sample
│  │  ├─ pre-push.sample
│  │  ├─ pre-rebase.sample
│  │  ├─ pre-receive.sample
│  │  ├─ prepare-commit-msg.sample
│  │  ├─ push-to-checkout.sample
│  │  ├─ sendemail-validate.sample
│  │  └─ update.sample
│  ├─ index
│  ├─ info
│  │  └─ exclude
│  ├─ logs
│  │  ├─ HEAD
│  │  └─ refs
│  │     ├─ heads
│  │     │  └─ master_local
│  │     └─ remotes
│  │        └─ origin
│  │           ├─ HEAD
│  │           └─ master
│  ├─ objects
│  │  ├─ 01
│  │  │  └─ 7f622c156ee4450418ac87e06158e12aaf4478
│  │  ├─ 02
│  │  │  └─ a676baacb828264813e073bcb73cbf9d03e5eb
│  │  ├─ 03
│  │  │  └─ 04773f029a73314dfd35b06077a188ed5264b0
│  │  ├─ 05
│  │  │  └─ 1ab575359e5e50fc8d9fdb33a11e2f565d32bc
│  │  ├─ 06
│  │  │  └─ 8eba32caf7afd090ba47aaa64d21e02668280d
│  │  ├─ 07
│  │  │  ├─ 49cbee08b1027f2a95a92a7b84db81459e07e3
│  │  │  └─ fbc00bc82d3f80e9e42e71439847356f270686
│  │  ├─ 08
│  │  │  ├─ 2e32bd0954db98ac258d2647a48079a93c9e9c
│  │  │  └─ 4fc678d63751531c9f9175febd86081f94d66a
│  │  ├─ 09
│  │  │  └─ 12ae359e107c051ab6abbd32560ee8cf28c8c4
│  │  ├─ 0b
│  │  │  └─ 2c7cfd806067c1b9f120361b47bad299a8394a
│  │  ├─ 0c
│  │  │  └─ b64fcb3d966a7cf610001ab918d52cf1885f5d
│  │  ├─ 10
│  │  │  └─ 1c0e8b4e5723ada45e34bea514d59c6d2a6f0a
│  │  ├─ 13
│  │  │  └─ ad0a3f92fb07656c12fcaa0cb43c78c3817f1e
│  │  ├─ 14
│  │  │  └─ 34d73cb7230939136b9c0543cba285cf182800
│  │  ├─ 1a
│  │  │  ├─ 1f1d83a61188c506e6ef39474687c85c785ffa
│  │  │  └─ ab973f1b03b6d85639b4683d54ea067ccec5bd
│  │  ├─ 1b
│  │  │  └─ d6e29b1735c4a9805bb35c96901aa9f7040b6b
│  │  ├─ 1d
│  │  │  └─ c2dbd3b45b7ea0f363715f5de85c00f6c7f428
│  │  ├─ 1e
│  │  │  ├─ 905590c866a3427e6880195b06439d2acfa08f
│  │  │  └─ 9d3cff4497cd60d7e135dc6c153c259dbbb81e
│  │  ├─ 21
│  │  │  └─ abf31eb78bcea0b92d46572bc65a91726b6794
│  │  ├─ 22
│  │  │  └─ 3e1cca9d3f8e646e758627df853269baf704dc
│  │  ├─ 24
│  │  │  └─ 5eff8e70bef65a5ab245f46494da59746799f6
│  │  ├─ 27
│  │  │  ├─ 843fbc4101dab1eacd123f244cf3014d7723e3
│  │  │  ├─ c8a0f1b3186417db2a34c22c67bbb8e821e10d
│  │  │  └─ d1e43522b71dc299bf21ea0aceebece31cd874
│  │  ├─ 29
│  │  │  └─ 592e8f1b4979a371e5168587c8669f2a44386a
│  │  ├─ 2c
│  │  │  ├─ 391302f2d7f7622c7a299d45fc8ec3a4712a05
│  │  │  └─ 497ebde4af6718c6c4f7374d0a8534ab5398dd
│  │  ├─ 2d
│  │  │  └─ c6cce039a15ea3d7add2d8aea2fb7b32347717
│  │  ├─ 2e
│  │  │  ├─ 3c51b083a9817a0c3cb68f37eb286fc85b0e40
│  │  │  ├─ 851a867277717130f8bb829e8f2c39444708ff
│  │  │  └─ 9e16cd64186c8c3fb7a184b063da34293f4593
│  │  ├─ 2f
│  │  │  ├─ 2b799f5a4be5d37bfccd9484c58122859a3d22
│  │  │  └─ 3dd3147e15d91450b5cf7f75d4e00f222f86de
│  │  ├─ 31
│  │  │  └─ 59b88f1432cfd7f448523f2b83ea300cac4217
│  │  ├─ 33
│  │  │  └─ 875c064628e98e7631a6a0046c2019ecd7ea34
│  │  ├─ 35
│  │  │  └─ cfcdb1fce641b2020d58baf06c7ee50ec4ef6d
│  │  ├─ 37
│  │  │  ├─ 8f2e8256118c63653a2396d5c384da22408795
│  │  │  └─ 96dea8a42699bd94a06121e7cfb69207b46737
│  │  ├─ 38
│  │  │  └─ 14e9eef3f08d73d5efacf92155cc26a4933ab4
│  │  ├─ 3c
│  │  │  ├─ 707ca5c662195ffe183b291f1c6083275bbc3e
│  │  │  └─ e4c24d7448540cd2fe5609ab30315a8f535f98
│  │  ├─ 3d
│  │  │  └─ 51aac735a0f9199b6e0d43fe5d2544c0c7f65b
│  │  ├─ 3e
│  │  │  ├─ 52f4e8be1cef7499b78ddef920e6b6d7dd875a
│  │  │  └─ 6bae2655b3fc6f9be652aefe5e7ccdf7af05ac
│  │  ├─ 40
│  │  │  ├─ 2f8b705f18dc39cdd4cf6b0faaea6ec994628c
│  │  │  └─ a84028b53f7f9177b4e5cd22c383e96d6085b1
│  │  ├─ 41
│  │  │  └─ 23fc2ae9db9e355eee560042a02a9332128ccb
│  │  ├─ 43
│  │  │  ├─ 1acec521e60c4b8d39da7ad108fad1da1534d6
│  │  │  └─ 530b510b3df03cf2423b947657abcc92edb635
│  │  ├─ 44
│  │  │  └─ cb51a93a8e31dff4d46477c190f2aa0d5f6be5
│  │  ├─ 45
│  │  │  └─ 40ad1799b72bf45bf104f85fb35b74e88bcc68
│  │  ├─ 48
│  │  │  └─ a7ddfa4931af71bb1f9cb615865ae39b0b968c
│  │  ├─ 4b
│  │  │  └─ 842888def494f8699071f3d3e16008886b4046
│  │  ├─ 4c
│  │  │  ├─ 05b96e7c6ec480800595cdb2812caa8c3d0b98
│  │  │  └─ 0b6a24cf8a127e6ec362ff3cf10b7e364d3540
│  │  ├─ 4f
│  │  │  └─ bf244c5cb21ba4c4380fade9fe4b7a28c38f88
│  │  ├─ 50
│  │  │  └─ db4875ac795ab29f6a4e47ada210c671d94971
│  │  ├─ 52
│  │  │  ├─ 6fe16db56d786f0da0a1dbae4e55d333bc9c09
│  │  │  └─ e5cf94e066cdd9f770c095e806c70bc6f3b25b
│  │  ├─ 55
│  │  │  ├─ 39ef217590df25d7e6bcbd26a878c4713a14e4
│  │  │  └─ ba88d56df677d5719f0e97bde47a6af07876fb
│  │  ├─ 56
│  │  │  └─ 244343dd4351e12c8bcb7b2991f12c78a18c6f
│  │  ├─ 57
│  │  │  ├─ 279e0d4129760b88625d61d4e4e406176aa497
│  │  │  └─ e6592b12abca33631d5a58fec1e00773e470c1
│  │  ├─ 5d
│  │  │  ├─ 628cd62b0ca04bfa8418fa936dc6806dee1726
│  │  │  └─ b266b8637a597afa10b25196e3c4de84b62a43
│  │  ├─ 5e
│  │  │  └─ 96f580c6f84a6219136403c6609c7a586fc0fd
│  │  ├─ 61
│  │  │  └─ bfa8cdc8ace39b4d7760c151835d8ec23d198e
│  │  ├─ 63
│  │  │  ├─ 1b5e4abcc9f3522fb4b258697084252b7bfe9b
│  │  │  └─ 5db6bad60188c58d50969bc63029f9fb157876
│  │  ├─ 65
│  │  │  ├─ 35337af8668e4ba84209f26cd0b1d32accfa5c
│  │  │  └─ 3d669cf444c20612beabab5bf6249622ea91da
│  │  ├─ 69
│  │  │  └─ fc0d5e1657e7eeead4e417721a8a8d96eec384
│  │  ├─ 6a
│  │  │  └─ ab0321744e1cdefbc812196762554b83429bf0
│  │  ├─ 6b
│  │  │  ├─ 70167a001640758af7b1e160bda57327de4e8e
│  │  │  ├─ f7db9413f9735ccfa63f0bb982286787f9c4fb
│  │  │  └─ fc22531508394433da8a6f03103722e59247f0
│  │  ├─ 6c
│  │  │  └─ 358b7bcd4da8255f008753757aad4a3453fdc6
│  │  ├─ 6d
│  │  │  └─ 8163ce4376a78d0ec76f222274743400c4df40
│  │  ├─ 6e
│  │  │  └─ 790b26590507ec9df137f70999d943470b0f36
│  │  ├─ 6f
│  │  │  ├─ 5c0d39271fd6c9070d1f0e095cc6bf95205b40
│  │  │  └─ 6f0a5ce7f5b433e93b3bb2dec221a422c4c5d8
│  │  ├─ 70
│  │  │  └─ 107d279f3e2ce7463fd0af859264cd22dac3b8
│  │  ├─ 74
│  │  │  ├─ 9a51967cb473ff1b43fd5f6e84ee0b4b01b558
│  │  │  └─ f20610ee2ef46e4d2fc91f3c5925c3aa849c0a
│  │  ├─ 76
│  │  │  ├─ 41cc2bcb57b338e601c5e5947a7758edaa63cc
│  │  │  └─ a50ce8eb9ac377c6942ab662e531e99aacfae1
│  │  ├─ 7f
│  │  │  └─ 90dc5bc3d5440414b3e1768d7a9297b8c0ab24
│  │  ├─ 80
│  │  │  └─ 3f029f9bc529647b11abfa03fd77b2262d3ab1
│  │  ├─ 83
│  │  │  └─ c201d288b5ae81043ebb24bfbe431c8ecd5279
│  │  ├─ 86
│  │  │  └─ 9b181fcb7ccc7f3adad85fab2bda7b98bd2980
│  │  ├─ 87
│  │  │  └─ d740aeaa770929403a7eb6ad2a439df6e65ba6
│  │  ├─ 88
│  │  │  ├─ 1996cff49729ae2f907252af09ec0ede8a84ac
│  │  │  └─ 3ce1236fa628784a8415d3a6b90b095368b038
│  │  ├─ 8a
│  │  │  ├─ 4d4ef80bec325c03bbcc5f4a62518b091cc994
│  │  │  ├─ 913fd1273a9949dab8da8e1f545573a6028a30
│  │  │  └─ a7062a1bffab6dfc7a5791667edc382be92a96
│  │  ├─ 8c
│  │  │  ├─ 9b54b904240a60017c6489b6a18fb79712af17
│  │  │  └─ ae02800af27789f71b33727d33fe17170f8592
│  │  ├─ 8f
│  │  │  ├─ 804a777d0a70b79c516ed2785284c87247a0a0
│  │  │  ├─ a054e7f7650103b7a6f5f7a48c571cfb524468
│  │  │  └─ c8a5f208327a2f77223175baadd6eaa409b6cf
│  │  ├─ 93
│  │  │  └─ c74bf8086404e4289fbfd6f041bae5db2591e1
│  │  ├─ 97
│  │  │  └─ facd6a596dcc51391ecfcabb451d31cb82a4bb
│  │  ├─ 9b
│  │  │  ├─ 630d063521bb1273da2eaab7efd9ecc76b5fdb
│  │  │  ├─ dbdf3243552e24ba715faacfd88c92f1f762b0
│  │  │  └─ dce3280b52870af1fc0e51969a79941bd6222a
│  │  ├─ 9e
│  │  │  └─ 6d9b6757769331129ff087398444cec77f93cb
│  │  ├─ 9f
│  │  │  └─ eb0c461cb2ad48afce9c27b3bd57a6225779a0
│  │  ├─ a3
│  │  │  └─ 8a096417fe13f28e66adbf61a1999d4a6ff47a
│  │  ├─ a4
│  │  │  └─ 95fd97c785ab99bc0ad0b07b25f913971fb84f
│  │  ├─ a6
│  │  │  ├─ 8df271a99c3ad4df2d509f2adae9e83f7d1675
│  │  │  └─ e64009df04e83dd9bf840a70593b830aececc3
│  │  ├─ a7
│  │  │  └─ 48488bacf6b5702e040923b185abf77df4b3b6
│  │  ├─ a8
│  │  │  ├─ 576b3fe5cc73691f419a2f911d95021e8b2d28
│  │  │  └─ c00addff837cf5e7f642ad360ee788091ae226
│  │  ├─ a9
│  │  │  ├─ 41443e1e25990e0efc10ffd518653d7b35b337
│  │  │  ├─ acab37dfa331ca3ae76ef2c83b7bb7afe2d66c
│  │  │  └─ b043f8a845959f03ab548a3d637e95eac87ff9
│  │  ├─ ac
│  │  │  └─ c03897cb779dc4b8a9bc50c078e44267901027
│  │  ├─ b0
│  │  │  └─ e4973f3c2971897748a3d126e6f64c9f7dd5de
│  │  ├─ b1
│  │  │  ├─ 3753a00ad770be10a3d426d8e4134e20a9e307
│  │  │  └─ be25ea95589c4ee57235b864d8ad259eff0fc2
│  │  ├─ b4
│  │  │  └─ 1703cb43fd4a8cbc607f1f676bcc2e8c57c286
│  │  ├─ b7
│  │  │  └─ d439d9ffa3fe9a7fe06787867ac378077f5167
│  │  ├─ be
│  │  │  └─ 563fa7a37c5931ab5f90ce7e59c442b68e97c3
│  │  ├─ bf
│  │  │  └─ f6edb0689c7ce26834d28ba1bc67834eeac01b
│  │  ├─ c1
│  │  │  └─ 9bdbb89ad1ef1d800486ebfac82205544770e6
│  │  ├─ c4
│  │  │  └─ 8e7e5b87ed35999fab7ec164d297d4406498dd
│  │  ├─ c5
│  │  │  └─ 166390d1a6f0bd8343890ac88198af850c29b1
│  │  ├─ c6
│  │  │  └─ 9bf4c82b8176588743b9b2a88ca2e7bf2953cd
│  │  ├─ c7
│  │  │  └─ 15e5f5e20f783333f13fbaff85ab770587bb91
│  │  ├─ c8
│  │  │  └─ e08fff089b78d06c19b1df76ce6351b19bf088
│  │  ├─ c9
│  │  │  └─ f776ab04f7610326a2033c95bcf0d5193fcff9
│  │  ├─ ca
│  │  │  └─ 7891ed031f1d617d1ade6b99adc80c9e1811c7
│  │  ├─ cb
│  │  │  └─ be99588e0b0c325c06fc08ae893efbbc0ad1d9
│  │  ├─ cf
│  │  │  └─ f0972a4d7d50f25485cd079c45d1e2095e84f7
│  │  ├─ d1
│  │  │  └─ 300d775c64d41956d1ab354d162ac50a0c45c8
│  │  ├─ d3
│  │  │  ├─ 302f34b1ec8bdf111026a914f4ab847b565987
│  │  │  └─ 84f528eea132eb110ddb59372124608778c018
│  │  ├─ d4
│  │  │  └─ a85e097a6007392294d9ad90cb62cc74098414
│  │  ├─ d5
│  │  │  ├─ 506a9a99a16b803f2e520b12f624b9c7e715b4
│  │  │  └─ 53d9ac327d6c7d4c1583e22b0a5824ac126c48
│  │  ├─ d6
│  │  │  └─ 3c0f605c8d8d869cef6d87f122def6df28a668
│  │  ├─ d7
│  │  │  └─ fd35f1bbd0c5bf4e6b1dbf4828e7346d4befcb
│  │  ├─ d8
│  │  │  └─ 9eb80ce45e704bddac7844cc8d843ef76e3d56
│  │  ├─ db
│  │  │  ├─ 0e462e8532bb2e311bee71ef194cef5b98c12b
│  │  │  └─ 8fd41cefeef1166af18fbbe3e69bbe6667dba1
│  │  ├─ dc
│  │  │  ├─ 112c264ce7396f58fbd5f8fa69bbd897a6382f
│  │  │  └─ 46abeabe3016adb276d2ad33bcad43c4b5c195
│  │  ├─ e1
│  │  │  ├─ 686724c894adecd055890da9fba2d6b39cf8e5
│  │  │  └─ e2c91340ce5c6e36dc5be02fd10f24c8e4ca2b
│  │  ├─ e2
│  │  │  └─ d89b2d79caa4d0f89c59ed5e2bed0d2c61b199
│  │  ├─ e3
│  │  │  └─ d6c3bbed43d1843db90be603bc832ef83dbca3
│  │  ├─ e6
│  │  │  └─ 9de29bb2d1d6434b8b29ae775ad8c2e48c5391
│  │  ├─ e7
│  │  │  ├─ 57df0bd0c98c225e54144f9c80faac697803fe
│  │  │  └─ 7fb216356502b05398603c8be9c73e25ccdd02
│  │  ├─ e8
│  │  │  └─ b093371d6d525ca983447eefd254962b1cf5ef
│  │  ├─ ea
│  │  │  ├─ 7c6a3ee7fb95787199486a954f942a31607df8
│  │  │  └─ c5cc68deffdfb7c69df862468db086bc19024c
│  │  ├─ eb
│  │  │  ├─ 0fc77ae550caa40186019640b1146437e08ce4
│  │  │  ├─ 8ed6bb0f6565befed74e534a8ecc682f06d2fa
│  │  │  └─ a457b062152c87be111f7cde9fa9d0614f729b
│  │  ├─ ec
│  │  │  └─ 5b6027f0b4a4d6aaa0a683d1610090d37a1e0c
│  │  ├─ ed
│  │  │  ├─ a39046ce4537f4a71e58706403d8500bed9b7a
│  │  │  └─ cc9d2108b54d92d463f6fd377db3987a7a55a6
│  │  ├─ f1
│  │  │  └─ 90228faef805a505902d102ff067f7cd66b38f
│  │  ├─ f3
│  │  │  └─ a1c26a4b99a80fab4fe65da948812b31ac7939
│  │  ├─ f4
│  │  │  └─ daa851b75543796371e0fa70c95387c8625c2f
│  │  ├─ f5
│  │  │  └─ 6b93d33c681bcc1a0f3aecc09730093ce82338
│  │  ├─ f7
│  │  │  └─ 0f7982fcbc3eb1c28697890136446f2a8c6d78
│  │  ├─ fa
│  │  │  ├─ 84f89c8eb335570c4115b65b72d5a000c33df7
│  │  │  ├─ a9705f9955de2bcf7d8ed895b38c4f30d4079a
│  │  │  └─ fc7851b52eb6116ae407c1b831b336b61a6a25
│  │  ├─ fb
│  │  │  └─ e0ed15555fef0b6dc72de53d7fb05e4f5dadc9
│  │  ├─ info
│  │  └─ pack
│  │     ├─ pack-90665f62536f9573412f3c69f09c2507137c2b7f.idx
│  │     ├─ pack-90665f62536f9573412f3c69f09c2507137c2b7f.pack
│  │     └─ pack-90665f62536f9573412f3c69f09c2507137c2b7f.rev
│  ├─ ORIG_HEAD
│  ├─ packed-refs
│  └─ refs
│     ├─ heads
│     │  └─ master_local
│     ├─ remotes
│     │  └─ origin
│     │     ├─ HEAD
│     │     └─ master
│     └─ tags
├─ .gitignore
├─ .idea
│  ├─ .gitignore
│  ├─ artifacts
│  │  └─ LaterApp_local_jar.xml
│  ├─ compiler.xml
│  ├─ easycode
│  │  └─ codebase-v2.xml
│  ├─ easycode.ignore
│  ├─ encodings.xml
│  ├─ jarRepositories.xml
│  ├─ Later_App_local_SpringBoot.iml
│  ├─ misc.xml
│  ├─ shelf
│  │  ├─ Uncommitted_changes_before_Update_at_24_08_2024_21_57_[Changes]
│  │  │  └─ shelved.patch
│  │  ├─ Uncommitted_changes_before_Update_at_24_08_2024_21_57__Changes_.xml
│  │  ├─ Uncommitted_changes_before_Update_at_24_08_2024_22_06_[Changes]
│  │  │  └─ shelved.patch
│  │  └─ Uncommitted_changes_before_Update_at_24_08_2024_22_06__Changes_.xml
│  ├─ uiDesigner.xml
│  ├─ vcs.xml
│  └─ workspace.xml
├─ api-gateway-microservice
│  ├─ pom.xml
│  └─ src
│     ├─ main
│     │  ├─ java
│     │  │  └─ gateway
│     │  │     └─ Main.java
│     │  └─ resources
│     └─ test
│        └─ java
├─ notification-microservice
│  ├─ pom.xml
│  └─ src
│     ├─ main
│     │  ├─ java
│     │  │  └─ notification
│     │  │     ├─ email
│     │  │     │  └─ EmailService.java
│     │  │     ├─ item
│     │  │     │  ├─ ItemDto.java
│     │  │     │  ├─ ItemKafkaConsumer.java
│     │  │     │  └─ ItemService.java
│     │  │     ├─ NotificationService.java
│     │  │     └─ user
│     │  │        ├─ UserKafkaConsumer.java
│     │  │        └─ UserService.java
│     │  └─ resources
│     │     └─ application.properties
│     └─ test
│        └─ java
├─ pom.xml
├─ README.md
└─ user-items-microservice
   ├─ .gitignore
   ├─ .mvn
   │  └─ wrapper
   │     └─ maven-wrapper.properties
   ├─ META-INF
   │  └─ MANIFEST.MF
   ├─ mvnw
   ├─ mvnw.cmd
   ├─ pom.xml
   └─ src
      ├─ main
      │  ├─ java
      │  │  └─ itemsUsers
      │  │     ├─ item
      │  │     │  ├─ Item.java
      │  │     │  ├─ ItemController.java
      │  │     │  ├─ ItemDto.java
      │  │     │  ├─ ItemRep.java
      │  │     │  ├─ ItemRepository.java
      │  │     │  └─ ItemService.java
      │  │     ├─ kafka
      │  │     │  ├─ KafkaConfiguration.java
      │  │     │  └─ KafkaProducer.java
      │  │     ├─ user
      │  │     │  ├─ User.java
      │  │     │  ├─ UserController.java
      │  │     │  ├─ UserDto.java
      │  │     │  ├─ UserMapper.java
      │  │     │  ├─ UserRep.java
      │  │     │  ├─ UserRepository.java
      │  │     │  ├─ UserRepositoryCustom.java
      │  │     │  ├─ UserRepositoryCustomImpl.java
      │  │     │  ├─ UserService.java
      │  │     │  └─ UserState.java
      │  │     └─ UserItemsService.java
      │  └─ resources
      │     ├─ application.properties
      │     └─ META-INF
      │        └─ MANIFEST.MF
      └─ test
         └─ java
            └─ com
               └─ projectLater
                  └─ app
                     └─ AppApplicationTests.java

```