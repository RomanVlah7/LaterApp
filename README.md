# Welcome to "Later" EN/BG

Wlcome to "Later", a pet-project with microservicies, kafka, AmazonS3, PostgeSQL and a little bit of compler magic)))
This is my pet-project an app called "Later" (an Pastebin app). In this app users can store a url or simple text. At
curent stage it consits of two microservicies "User-items-service"(for CRUD operations) and "Notification-service"(to
send notifications via email using Google smtp)

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
│  │  ├─ 00
│  │  │  └─ 9f6a2e99b3ec6655b7de48b7911074bcb6e310
│  │  ├─ 01
│  │  │  ├─ 273f056b7d8209c3c3225a24a830c04c485a3e
│  │  │  ├─ 7f622c156ee4450418ac87e06158e12aaf4478
│  │  │  └─ ba15bc7611eed434304621018d41ea3440192f
│  │  ├─ 02
│  │  │  ├─ 6513adf6456d47aa4f78a2b2dc476631a2d920
│  │  │  └─ a676baacb828264813e073bcb73cbf9d03e5eb
│  │  ├─ 03
│  │  │  ├─ 04773f029a73314dfd35b06077a188ed5264b0
│  │  │  └─ b6d498b2622b1dce759154837cca59a1fb0fe1
│  │  ├─ 04
│  │  │  └─ 4bf7bc9a5e63f6e2d6f7ce7391ad89e7f4b497
│  │  ├─ 05
│  │  │  └─ 1ab575359e5e50fc8d9fdb33a11e2f565d32bc
│  │  ├─ 06
│  │  │  └─ 8eba32caf7afd090ba47aaa64d21e02668280d
│  │  ├─ 07
│  │  │  ├─ 49cbee08b1027f2a95a92a7b84db81459e07e3
│  │  │  └─ fbc00bc82d3f80e9e42e71439847356f270686
│  │  ├─ 08
│  │  │  ├─ 2e32bd0954db98ac258d2647a48079a93c9e9c
│  │  │  ├─ 4fc678d63751531c9f9175febd86081f94d66a
│  │  │  └─ 51b17859753e92fe87839f14347367ee63fdaf
│  │  ├─ 09
│  │  │  ├─ 12ae359e107c051ab6abbd32560ee8cf28c8c4
│  │  │  └─ 67b429ba9c629d5c449c24c41eee5bf762ba41
│  │  ├─ 0a
│  │  │  ├─ 39c69dae0cade05c781bc676868fe4cb3a3aad
│  │  │  └─ c29aea836082bfff82126120e789d496f4b47d
│  │  ├─ 0b
│  │  │  └─ 2c7cfd806067c1b9f120361b47bad299a8394a
│  │  ├─ 0c
│  │  │  └─ b64fcb3d966a7cf610001ab918d52cf1885f5d
│  │  ├─ 0d
│  │  │  ├─ 2864f5263ab24bc3bd38640d86eb4b2cba6da9
│  │  │  └─ 65d43e86058794301eb473a0b0dbcac4255895
│  │  ├─ 0e
│  │  │  └─ 9d3e42d9e8eacba97b5fb2c4c9cc29bb42183a
│  │  ├─ 10
│  │  │  └─ 1c0e8b4e5723ada45e34bea514d59c6d2a6f0a
│  │  ├─ 12
│  │  │  └─ c1670c3566504ff001cbd9c5ed6574923e1eb3
│  │  ├─ 13
│  │  │  └─ ad0a3f92fb07656c12fcaa0cb43c78c3817f1e
│  │  ├─ 14
│  │  │  └─ 34d73cb7230939136b9c0543cba285cf182800
│  │  ├─ 15
│  │  │  └─ 052ef43e6be02b08101f2d763976d1c38b0990
│  │  ├─ 16
│  │  │  └─ fa679c47a6a2a1722d72abe5b28dcd5ed75f71
│  │  ├─ 1a
│  │  │  ├─ 1f1d83a61188c506e6ef39474687c85c785ffa
│  │  │  └─ ab973f1b03b6d85639b4683d54ea067ccec5bd
│  │  ├─ 1b
│  │  │  ├─ a56cabcbb61f2a921471c4ed37ae836e35854d
│  │  │  ├─ b90bcbe8299e41064dd8dbc5d9617c7a5aa7b0
│  │  │  └─ d6e29b1735c4a9805bb35c96901aa9f7040b6b
│  │  ├─ 1c
│  │  │  ├─ 5c43d55025174e86817a7ff2b4b7a482d621a4
│  │  │  ├─ 63385f502576545aaebe47f09a44c418dbb202
│  │  │  └─ dae2383509c4c971afb18ad2500d56b56c2366
│  │  ├─ 1d
│  │  │  └─ c2dbd3b45b7ea0f363715f5de85c00f6c7f428
│  │  ├─ 1e
│  │  │  ├─ 905590c866a3427e6880195b06439d2acfa08f
│  │  │  └─ 9d3cff4497cd60d7e135dc6c153c259dbbb81e
│  │  ├─ 21
│  │  │  └─ abf31eb78bcea0b92d46572bc65a91726b6794
│  │  ├─ 22
│  │  │  └─ 3e1cca9d3f8e646e758627df853269baf704dc
│  │  ├─ 23
│  │  │  └─ f2264bdeea2250b48d4277adfc8b2075019121
│  │  ├─ 24
│  │  │  ├─ 5eff8e70bef65a5ab245f46494da59746799f6
│  │  │  └─ cbba137cec6ea0ef11f9105c704bc80d81ac3f
│  │  ├─ 25
│  │  │  ├─ 4519eeadb19eaabe3f7a8f9e327502c8c5d348
│  │  │  ├─ 6c5956980e307f74a2a57508db9822bd48979d
│  │  │  └─ d8662255c63c1b005b73920fed2622ccc9a85f
│  │  ├─ 27
│  │  │  ├─ 447c8a352112c5b7a2b79c95dcf0df54ab4fce
│  │  │  ├─ 843fbc4101dab1eacd123f244cf3014d7723e3
│  │  │  ├─ c8a0f1b3186417db2a34c22c67bbb8e821e10d
│  │  │  └─ d1e43522b71dc299bf21ea0aceebece31cd874
│  │  ├─ 29
│  │  │  └─ 592e8f1b4979a371e5168587c8669f2a44386a
│  │  ├─ 2a
│  │  │  ├─ 02629485c575b47abe3eda9db73953d1b63b4e
│  │  │  └─ 50fdba5cfe7a6547433cb685a7646b2bf83336
│  │  ├─ 2b
│  │  │  └─ 970c7361cb2eb042b0b9aca944b80e119e0ea8
│  │  ├─ 2c
│  │  │  ├─ 32a733fc195d6e3085214b69422f5c56c9117e
│  │  │  ├─ 391302f2d7f7622c7a299d45fc8ec3a4712a05
│  │  │  └─ 497ebde4af6718c6c4f7374d0a8534ab5398dd
│  │  ├─ 2d
│  │  │  ├─ 670d5c9ca441320532c6b0946b3b748c46b2d4
│  │  │  ├─ b238b3d00678b907edf79d2bc981410cda0b0f
│  │  │  └─ c6cce039a15ea3d7add2d8aea2fb7b32347717
│  │  ├─ 2e
│  │  │  ├─ 14a0a827b9ba2e34e8ac8ed9aefcadf5408fbf
│  │  │  ├─ 3c51b083a9817a0c3cb68f37eb286fc85b0e40
│  │  │  ├─ 851a867277717130f8bb829e8f2c39444708ff
│  │  │  └─ 9e16cd64186c8c3fb7a184b063da34293f4593
│  │  ├─ 2f
│  │  │  ├─ 2b799f5a4be5d37bfccd9484c58122859a3d22
│  │  │  └─ 3dd3147e15d91450b5cf7f75d4e00f222f86de
│  │  ├─ 31
│  │  │  └─ 59b88f1432cfd7f448523f2b83ea300cac4217
│  │  ├─ 33
│  │  │  ├─ 107e53e7785daaa85fb9df4bdbe8118e60607a
│  │  │  ├─ 875c064628e98e7631a6a0046c2019ecd7ea34
│  │  │  └─ f729a5408ad5ff8e44bf5c8ff97aef03965b64
│  │  ├─ 34
│  │  │  ├─ 737427223bbc93aa9de3b061f71056cb0b1774
│  │  │  └─ 98d44890c07880a783d81d98005ef58e9b051e
│  │  ├─ 35
│  │  │  ├─ b6f0715f497d30c93038cf5349e09da78293b5
│  │  │  └─ cfcdb1fce641b2020d58baf06c7ee50ec4ef6d
│  │  ├─ 37
│  │  │  ├─ 8f2e8256118c63653a2396d5c384da22408795
│  │  │  └─ 96dea8a42699bd94a06121e7cfb69207b46737
│  │  ├─ 38
│  │  │  └─ 14e9eef3f08d73d5efacf92155cc26a4933ab4
│  │  ├─ 3c
│  │  │  ├─ 707ca5c662195ffe183b291f1c6083275bbc3e
│  │  │  ├─ aa678cc3f4f85240a74cf9891c3f7db14f3d33
│  │  │  └─ e4c24d7448540cd2fe5609ab30315a8f535f98
│  │  ├─ 3d
│  │  │  └─ 51aac735a0f9199b6e0d43fe5d2544c0c7f65b
│  │  ├─ 3e
│  │  │  ├─ 52f4e8be1cef7499b78ddef920e6b6d7dd875a
│  │  │  └─ 6bae2655b3fc6f9be652aefe5e7ccdf7af05ac
│  │  ├─ 3f
│  │  │  ├─ 2d3635286b3acd61155aae76680d09a34d6760
│  │  │  └─ 683658c17a55e60c64b5c726633b016ae5a48c
│  │  ├─ 40
│  │  │  ├─ 2f8b705f18dc39cdd4cf6b0faaea6ec994628c
│  │  │  └─ a84028b53f7f9177b4e5cd22c383e96d6085b1
│  │  ├─ 41
│  │  │  └─ 23fc2ae9db9e355eee560042a02a9332128ccb
│  │  ├─ 43
│  │  │  ├─ 1acec521e60c4b8d39da7ad108fad1da1534d6
│  │  │  └─ 530b510b3df03cf2423b947657abcc92edb635
│  │  ├─ 44
│  │  │  ├─ 32c98ca7b69541e26dc784154dc0bcfddc2512
│  │  │  └─ cb51a93a8e31dff4d46477c190f2aa0d5f6be5
│  │  ├─ 45
│  │  │  └─ 40ad1799b72bf45bf104f85fb35b74e88bcc68
│  │  ├─ 46
│  │  │  └─ ea4238cb717405b208c0e186f82627c87c6b1e
│  │  ├─ 47
│  │  │  └─ 235de170dbb7f127e9b8195d1997a9f3d125e3
│  │  ├─ 48
│  │  │  ├─ a7ddfa4931af71bb1f9cb615865ae39b0b968c
│  │  │  └─ d9ae6b78d7738762b84d19ced301e21e7b1a11
│  │  ├─ 49
│  │  │  └─ dcecf1b15d2c7e43eb30489e32da3d0abe52cb
│  │  ├─ 4b
│  │  │  ├─ 09cb02263cbc80e3d8d8e5ca305a7440d4126a
│  │  │  ├─ 68369b8bd2d7b7ced579440eaa7f169e7885ea
│  │  │  ├─ 842888def494f8699071f3d3e16008886b4046
│  │  │  └─ f20e14180824666fe7f326506d577cb8dc6d3e
│  │  ├─ 4c
│  │  │  ├─ 05b96e7c6ec480800595cdb2812caa8c3d0b98
│  │  │  ├─ 0b6a24cf8a127e6ec362ff3cf10b7e364d3540
│  │  │  └─ a028c9d50604dd91555cb1f8c80aeaf790c50d
│  │  ├─ 4f
│  │  │  └─ bf244c5cb21ba4c4380fade9fe4b7a28c38f88
│  │  ├─ 50
│  │  │  ├─ 5672442c17ca473e557ba5d418202b794b238e
│  │  │  ├─ c11101c0dffd8478e0a317ca480ed364d53fa5
│  │  │  └─ db4875ac795ab29f6a4e47ada210c671d94971
│  │  ├─ 51
│  │  │  └─ ebe321f915d44ab3d73b5c05f11ec2099e5e98
│  │  ├─ 52
│  │  │  ├─ 6fe16db56d786f0da0a1dbae4e55d333bc9c09
│  │  │  ├─ b83739d165e3e9d718a7640c734a7deae8975a
│  │  │  ├─ e5cf94e066cdd9f770c095e806c70bc6f3b25b
│  │  │  └─ e7bbaa13e5ed29dea23eee74ee9cfc7ca54ac4
│  │  ├─ 53
│  │  │  ├─ 95a425a6df96c24acd59680638944ad1b117a5
│  │  │  └─ b6b5603ce64a745fe662e49000b0ead979b149
│  │  ├─ 54
│  │  │  └─ 8914d11a0a7099b219c05d37fa54e08d8b4923
│  │  ├─ 55
│  │  │  ├─ 2db454e6e5abadf92b5615fd5211e9c26a587e
│  │  │  ├─ 39ef217590df25d7e6bcbd26a878c4713a14e4
│  │  │  └─ ba88d56df677d5719f0e97bde47a6af07876fb
│  │  ├─ 56
│  │  │  └─ 244343dd4351e12c8bcb7b2991f12c78a18c6f
│  │  ├─ 57
│  │  │  ├─ 279e0d4129760b88625d61d4e4e406176aa497
│  │  │  └─ e6592b12abca33631d5a58fec1e00773e470c1
│  │  ├─ 58
│  │  │  └─ c8f6d6dc07c7e40b3c106cc136634437022f30
│  │  ├─ 5b
│  │  │  └─ 3a9d0dffccaf02f57ceabccb83cf204524749b
│  │  ├─ 5d
│  │  │  ├─ 628cd62b0ca04bfa8418fa936dc6806dee1726
│  │  │  └─ b266b8637a597afa10b25196e3c4de84b62a43
│  │  ├─ 5e
│  │  │  └─ 96f580c6f84a6219136403c6609c7a586fc0fd
│  │  ├─ 60
│  │  │  ├─ 5b711a9665582f7e03d2946fdc70967b9e5777
│  │  │  ├─ dbe27a450579abe9cb925ab90dc4d8bf9d11e7
│  │  │  └─ fbb710867dbda9426cf768e14eca0bc8b885fb
│  │  ├─ 61
│  │  │  ├─ 52632762604494c9b1575301a0ba5531df53d9
│  │  │  ├─ bfa8cdc8ace39b4d7760c151835d8ec23d198e
│  │  │  └─ fae2f96f699896ad42b2a9a1dc9ce2428e77b8
│  │  ├─ 63
│  │  │  ├─ 1b5e4abcc9f3522fb4b258697084252b7bfe9b
│  │  │  ├─ 5db6bad60188c58d50969bc63029f9fb157876
│  │  │  └─ 6359fb19a4c7dc605342f8ce4d2d34a82a3a96
│  │  ├─ 64
│  │  │  └─ f08a8ff0d9fcbe8b672143fe9e3609ac91160d
│  │  ├─ 65
│  │  │  ├─ 35337af8668e4ba84209f26cd0b1d32accfa5c
│  │  │  ├─ 3d669cf444c20612beabab5bf6249622ea91da
│  │  │  ├─ 527e61f4b34f65ee3859f6e8d6be169684447b
│  │  │  ├─ 71715b53731f3511248ba82a4e4a12f246a679
│  │  │  └─ ea1800baf1f584a02c3704de04f96c86d10a7a
│  │  ├─ 69
│  │  │  ├─ 4d557b5a7f3ed9582c8b74838646b288c1333f
│  │  │  └─ fc0d5e1657e7eeead4e417721a8a8d96eec384
│  │  ├─ 6a
│  │  │  ├─ ab0321744e1cdefbc812196762554b83429bf0
│  │  │  └─ bb49fedba29522f2be9d22d88975c57c848257
│  │  ├─ 6b
│  │  │  ├─ 70167a001640758af7b1e160bda57327de4e8e
│  │  │  ├─ f7db9413f9735ccfa63f0bb982286787f9c4fb
│  │  │  └─ fc22531508394433da8a6f03103722e59247f0
│  │  ├─ 6c
│  │  │  └─ 358b7bcd4da8255f008753757aad4a3453fdc6
│  │  ├─ 6d
│  │  │  └─ 8163ce4376a78d0ec76f222274743400c4df40
│  │  ├─ 6e
│  │  │  ├─ 76a2f39eab7a48280e6221ba94610395489579
│  │  │  ├─ 790b26590507ec9df137f70999d943470b0f36
│  │  │  └─ fe2620bd1e8c01363dda8c34f3b864c33ea38a
│  │  ├─ 6f
│  │  │  ├─ 5c0d39271fd6c9070d1f0e095cc6bf95205b40
│  │  │  └─ 6f0a5ce7f5b433e93b3bb2dec221a422c4c5d8
│  │  ├─ 70
│  │  │  └─ 107d279f3e2ce7463fd0af859264cd22dac3b8
│  │  ├─ 72
│  │  │  └─ f4f872db4f420d68ea346435824f720d19a406
│  │  ├─ 74
│  │  │  ├─ 9a51967cb473ff1b43fd5f6e84ee0b4b01b558
│  │  │  ├─ ea8c8c315d14c0e907d67f551f298c29494085
│  │  │  └─ f20610ee2ef46e4d2fc91f3c5925c3aa849c0a
│  │  ├─ 75
│  │  │  └─ a1aadedc58bd1953d0a019215c4a9306ec8c18
│  │  ├─ 76
│  │  │  ├─ 41cc2bcb57b338e601c5e5947a7758edaa63cc
│  │  │  └─ a50ce8eb9ac377c6942ab662e531e99aacfae1
│  │  ├─ 78
│  │  │  └─ 2e2a3be8aab40dab7a248ff7d83b38ff14df55
│  │  ├─ 79
│  │  │  └─ c3d89819683ef5b0b9e6f2e4e569cf30553e01
│  │  ├─ 7f
│  │  │  ├─ 15e2783fc0bde9c7e3c95e35bd1b50ff69ae06
│  │  │  └─ 90dc5bc3d5440414b3e1768d7a9297b8c0ab24
│  │  ├─ 80
│  │  │  ├─ 08d852aa85c28a08de0ecd040e036b4512e1ea
│  │  │  └─ 3f029f9bc529647b11abfa03fd77b2262d3ab1
│  │  ├─ 83
│  │  │  └─ c201d288b5ae81043ebb24bfbe431c8ecd5279
│  │  ├─ 86
│  │  │  ├─ 9b181fcb7ccc7f3adad85fab2bda7b98bd2980
│  │  │  └─ cf7e60dd09dba771b790ef1467ed184dc2936e
│  │  ├─ 87
│  │  │  └─ d740aeaa770929403a7eb6ad2a439df6e65ba6
│  │  ├─ 88
│  │  │  ├─ 1996cff49729ae2f907252af09ec0ede8a84ac
│  │  │  └─ 3ce1236fa628784a8415d3a6b90b095368b038
│  │  ├─ 8a
│  │  │  ├─ 4d4ef80bec325c03bbcc5f4a62518b091cc994
│  │  │  ├─ 7ead30bae0d79069098b6e4b974c92c91002f0
│  │  │  ├─ 8e5ca21b6407354002de7730bb25c53ed81f2e
│  │  │  ├─ 913fd1273a9949dab8da8e1f545573a6028a30
│  │  │  └─ a7062a1bffab6dfc7a5791667edc382be92a96
│  │  ├─ 8c
│  │  │  ├─ 9b54b904240a60017c6489b6a18fb79712af17
│  │  │  └─ ae02800af27789f71b33727d33fe17170f8592
│  │  ├─ 8f
│  │  │  ├─ 804a777d0a70b79c516ed2785284c87247a0a0
│  │  │  ├─ 8935fc48627ec0750e8f02938d9982fe2c14a2
│  │  │  ├─ a054e7f7650103b7a6f5f7a48c571cfb524468
│  │  │  └─ c8a5f208327a2f77223175baadd6eaa409b6cf
│  │  ├─ 90
│  │  │  └─ 16b53566b011c1a8247c3ebc89f3b82326d616
│  │  ├─ 91
│  │  │  ├─ 2fbd98330e6ddee882eb8fd2184ca9d08b0394
│  │  │  └─ b5f53669d77971859b4fb119ac46fcd83aa519
│  │  ├─ 92
│  │  │  ├─ 96eb8796bb44f53138dc8d0ecb1fb5abba85db
│  │  │  └─ f3e09e1dad66452f92d11f1be200e952424cf6
│  │  ├─ 93
│  │  │  ├─ 74623938c8441d098ab31ad3c6429c1940445c
│  │  │  └─ c74bf8086404e4289fbfd6f041bae5db2591e1
│  │  ├─ 96
│  │  │  └─ f78f6088f8741ea0591dbd202360b2e78f3d7f
│  │  ├─ 97
│  │  │  ├─ 0fbbfba32866fae6a7d4c09de9c1fe926a1dfb
│  │  │  ├─ 137b51c77ccdd2878d2769e6d8c53f2c02aba5
│  │  │  └─ facd6a596dcc51391ecfcabb451d31cb82a4bb
│  │  ├─ 99
│  │  │  ├─ 0c477158fb8870b25e812fa11f67683ec12455
│  │  │  └─ 1e94dee6960a2cfe65f113a2facde10df01cc1
│  │  ├─ 9a
│  │  │  └─ d08f0dbddbd26a9202bf0b5e5f239d4c041892
│  │  ├─ 9b
│  │  │  ├─ 630d063521bb1273da2eaab7efd9ecc76b5fdb
│  │  │  ├─ dbdf3243552e24ba715faacfd88c92f1f762b0
│  │  │  └─ dce3280b52870af1fc0e51969a79941bd6222a
│  │  ├─ 9d
│  │  │  ├─ 09c62fb2d31bceb3dd30a33fb827a9c073323f
│  │  │  └─ 17cbd57aa2674072b02b19c8eb79f598ec64f5
│  │  ├─ 9e
│  │  │  ├─ 6d9b6757769331129ff087398444cec77f93cb
│  │  │  └─ 9ea2b82e4bc5a7402643c965037877ce456009
│  │  ├─ 9f
│  │  │  ├─ 9b5af120904b927d2b0234ef835b7e1d499fec
│  │  │  └─ eb0c461cb2ad48afce9c27b3bd57a6225779a0
│  │  ├─ a0
│  │  │  ├─ 3a0a66be6f4f0998bb2e794591caa6eb5d8ee4
│  │  │  ├─ 4d9169d18af13280e5b9a3133b7f5132446619
│  │  │  └─ 63ff6493fab681a9f8dbfb7d940f3d400d22ea
│  │  ├─ a1
│  │  │  └─ 45f415fc269ca2983f9f6eb49ef85badf5c371
│  │  ├─ a2
│  │  │  ├─ 1983aada450575fadfad5439a099dbab53fc74
│  │  │  └─ 68cde39034315821636bafc094ef53f7f87d50
│  │  ├─ a3
│  │  │  ├─ 8a096417fe13f28e66adbf61a1999d4a6ff47a
│  │  │  └─ 9844bcb2cacb955d24e5be171d9073899cff79
│  │  ├─ a4
│  │  │  └─ 95fd97c785ab99bc0ad0b07b25f913971fb84f
│  │  ├─ a5
│  │  │  └─ d5e67aeac9a095906df9b04afcdcd131667782
│  │  ├─ a6
│  │  │  ├─ 8df271a99c3ad4df2d509f2adae9e83f7d1675
│  │  │  ├─ e64009df04e83dd9bf840a70593b830aececc3
│  │  │  └─ ed2170582113a806dd3d57cf5037e0370d4c34
│  │  ├─ a7
│  │  │  └─ 48488bacf6b5702e040923b185abf77df4b3b6
│  │  ├─ a8
│  │  │  ├─ 576b3fe5cc73691f419a2f911d95021e8b2d28
│  │  │  └─ c00addff837cf5e7f642ad360ee788091ae226
│  │  ├─ a9
│  │  │  ├─ 41443e1e25990e0efc10ffd518653d7b35b337
│  │  │  ├─ acab37dfa331ca3ae76ef2c83b7bb7afe2d66c
│  │  │  ├─ b043f8a845959f03ab548a3d637e95eac87ff9
│  │  │  └─ dcd087191f94769863cc42ff4022e1217e2ca6
│  │  ├─ ab
│  │  │  └─ 28298515a551b781d0e547cc9b3d1494f0f3f1
│  │  ├─ ac
│  │  │  └─ c03897cb779dc4b8a9bc50c078e44267901027
│  │  ├─ b0
│  │  │  └─ e4973f3c2971897748a3d126e6f64c9f7dd5de
│  │  ├─ b1
│  │  │  ├─ 3753a00ad770be10a3d426d8e4134e20a9e307
│  │  │  └─ be25ea95589c4ee57235b864d8ad259eff0fc2
│  │  ├─ b3
│  │  │  └─ a7373eb9ced4730f3a8844bb94aed29897435e
│  │  ├─ b4
│  │  │  └─ 1703cb43fd4a8cbc607f1f676bcc2e8c57c286
│  │  ├─ b7
│  │  │  ├─ 3abdb99c7531a995650e133ef6f544c6f673b8
│  │  │  ├─ d439d9ffa3fe9a7fe06787867ac378077f5167
│  │  │  └─ d894272a4f6d2ee24baca49e14e3dc76c9c1a5
│  │  ├─ b8
│  │  │  └─ 4abc8324a73cfd3606189e8d4569b4e67db22d
│  │  ├─ b9
│  │  │  └─ e40006ad45f4ecffd763f41b4a98dd3aa2a302
│  │  ├─ ba
│  │  │  ├─ 262b6acbf205bb9877d889e556196b7e91fe7a
│  │  │  └─ 298dcf6d89a12cccbf5f6d3619404e118037d6
│  │  ├─ be
│  │  │  ├─ 563fa7a37c5931ab5f90ce7e59c442b68e97c3
│  │  │  └─ 585df4fbdee0e3f65a955605e18159d236d94c
│  │  ├─ bf
│  │  │  └─ f6edb0689c7ce26834d28ba1bc67834eeac01b
│  │  ├─ c1
│  │  │  └─ 9bdbb89ad1ef1d800486ebfac82205544770e6
│  │  ├─ c3
│  │  │  ├─ 680a00f1561577ee98de3ad8d0a62e3a4555e1
│  │  │  ├─ 6e2c69cf081da9796bf3ed5558df6b271c76f7
│  │  │  └─ d96496c2aa81927a9a947a8f44672fbb9d8732
│  │  ├─ c4
│  │  │  └─ 8e7e5b87ed35999fab7ec164d297d4406498dd
│  │  ├─ c5
│  │  │  ├─ 166390d1a6f0bd8343890ac88198af850c29b1
│  │  │  └─ 3dc1598bf8a13abb45be3daf3138e4c88b0f96
│  │  ├─ c6
│  │  │  ├─ 0f212186c90f3a78d8d6369b25580c6c61309d
│  │  │  └─ 9bf4c82b8176588743b9b2a88ca2e7bf2953cd
│  │  ├─ c7
│  │  │  ├─ 15e5f5e20f783333f13fbaff85ab770587bb91
│  │  │  └─ 7ae903b40de0177b91b2c3f5e0210d9574de46
│  │  ├─ c8
│  │  │  └─ e08fff089b78d06c19b1df76ce6351b19bf088
│  │  ├─ c9
│  │  │  └─ f776ab04f7610326a2033c95bcf0d5193fcff9
│  │  ├─ ca
│  │  │  └─ 7891ed031f1d617d1ade6b99adc80c9e1811c7
│  │  ├─ cb
│  │  │  └─ be99588e0b0c325c06fc08ae893efbbc0ad1d9
│  │  ├─ cc
│  │  │  └─ e4205dd145187e76f24ba0528a97480e306b1c
│  │  ├─ cd
│  │  │  ├─ 80b959c182560f108fc6201098654803c0a903
│  │  │  └─ c3560551e795230c61d43d781de07ffbed0db3
│  │  ├─ cf
│  │  │  ├─ 453682aa4f2d2c8c89ff337a6a0f6602369a75
│  │  │  ├─ a9f089dba017351f90ac726b763f05cf365dc9
│  │  │  └─ f0972a4d7d50f25485cd079c45d1e2095e84f7
│  │  ├─ d1
│  │  │  ├─ 1cc6eed8d36d2c93e44df50ab70790eed763d9
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
│  │  │  ├─ 3c0f605c8d8d869cef6d87f122def6df28a668
│  │  │  └─ 8688dd0edf19efa7b20950d995496d2c6c1686
│  │  ├─ d7
│  │  │  ├─ 63ecd5cbc5381ed13aea6426845de785aa1f7b
│  │  │  └─ fd35f1bbd0c5bf4e6b1dbf4828e7346d4befcb
│  │  ├─ d8
│  │  │  ├─ 9eb80ce45e704bddac7844cc8d843ef76e3d56
│  │  │  └─ a040ebfca8f6aef08c57a642fee681cec094dd
│  │  ├─ da
│  │  │  ├─ 14d45e6645638b2406e9effc786a29e49bde0d
│  │  │  └─ 665d53aa799ae0c53ed12755a0f917ed365592
│  │  ├─ db
│  │  │  ├─ 0e462e8532bb2e311bee71ef194cef5b98c12b
│  │  │  └─ 8fd41cefeef1166af18fbbe3e69bbe6667dba1
│  │  ├─ dc
│  │  │  ├─ 112c264ce7396f58fbd5f8fa69bbd897a6382f
│  │  │  ├─ 46abeabe3016adb276d2ad33bcad43c4b5c195
│  │  │  └─ f53ef7a2440a1eaae9ed4aec8c43f92e1ef36d
│  │  ├─ de
│  │  │  └─ e60a2c4741e261b2237ef6e5e508c5357f0f27
│  │  ├─ df
│  │  │  ├─ 31dff034592f078ff78ea3b20f165720226ead
│  │  │  ├─ 4b1d2437e5228726962b5e9cf6c299a063a35b
│  │  │  └─ e88d30f85386bcca929f9ace38adeba32a92da
│  │  ├─ e1
│  │  │  ├─ 686724c894adecd055890da9fba2d6b39cf8e5
│  │  │  └─ e2c91340ce5c6e36dc5be02fd10f24c8e4ca2b
│  │  ├─ e2
│  │  │  └─ d89b2d79caa4d0f89c59ed5e2bed0d2c61b199
│  │  ├─ e3
│  │  │  ├─ 6c0571f64dcf0611f96f6b9347a0fbc7dfd2b7
│  │  │  ├─ b8dc0d98c8240772051bc9c451b2d82ff066ee
│  │  │  ├─ bbaa21fd3c995e59c13ec4079f8fa33d042f86
│  │  │  └─ d6c3bbed43d1843db90be603bc832ef83dbca3
│  │  ├─ e5
│  │  │  └─ 9a6c7f6bbd0c03804039c7eae42a2c9f37acfe
│  │  ├─ e6
│  │  │  ├─ 9de29bb2d1d6434b8b29ae775ad8c2e48c5391
│  │  │  └─ ba0f849fc74ff739ed3354904b91d53e941b51
│  │  ├─ e7
│  │  │  ├─ 52f1ccf6dd4ffeba572ae3a83ae881042d4dc5
│  │  │  ├─ 57df0bd0c98c225e54144f9c80faac697803fe
│  │  │  └─ 7fb216356502b05398603c8be9c73e25ccdd02
│  │  ├─ e8
│  │  │  └─ b093371d6d525ca983447eefd254962b1cf5ef
│  │  ├─ ea
│  │  │  ├─ 7c6a3ee7fb95787199486a954f942a31607df8
│  │  │  ├─ c5cc68deffdfb7c69df862468db086bc19024c
│  │  │  └─ f2b92b22aebdefbb272ba864a31fa411061a7a
│  │  ├─ eb
│  │  │  ├─ 0fc77ae550caa40186019640b1146437e08ce4
│  │  │  ├─ 8ed6bb0f6565befed74e534a8ecc682f06d2fa
│  │  │  └─ a457b062152c87be111f7cde9fa9d0614f729b
│  │  ├─ ec
│  │  │  ├─ 09de6e53dadc600b9783325a40528c03f1f5b9
│  │  │  ├─ 5b6027f0b4a4d6aaa0a683d1610090d37a1e0c
│  │  │  └─ dc29f41d36cb028578062deb3b79b41cda1cc3
│  │  ├─ ed
│  │  │  ├─ a39046ce4537f4a71e58706403d8500bed9b7a
│  │  │  └─ cc9d2108b54d92d463f6fd377db3987a7a55a6
│  │  ├─ f0
│  │  │  └─ 13dd7e08fa07a9d6c0097604d613befcf0a2de
│  │  ├─ f1
│  │  │  ├─ 136e971eced1059a59bdf12b42e8180829dd4d
│  │  │  ├─ 4db63acc4237ca8828201c82475c423b286d91
│  │  │  ├─ 50446f5362a70b9611705dea196914d2b95d2d
│  │  │  └─ 90228faef805a505902d102ff067f7cd66b38f
│  │  ├─ f2
│  │  │  └─ dc1aac4b1981984b094b3c3b4a07f5b44f4a9c
│  │  ├─ f3
│  │  │  ├─ 3a5284787985289893ed69314e337bf5b2f154
│  │  │  ├─ a1c26a4b99a80fab4fe65da948812b31ac7939
│  │  │  └─ f8275ed6014b4b63fb1440a3f13f92de279ab4
│  │  ├─ f4
│  │  │  └─ daa851b75543796371e0fa70c95387c8625c2f
│  │  ├─ f5
│  │  │  ├─ 6b93d33c681bcc1a0f3aecc09730093ce82338
│  │  │  ├─ 8e0e6771a7cc915a2e87361f24089210413f03
│  │  │  └─ bfaf2da7430689ab983cbd8c7c12c708ae59de
│  │  ├─ f7
│  │  │  └─ 0f7982fcbc3eb1c28697890136446f2a8c6d78
│  │  ├─ fa
│  │  │  ├─ 84f89c8eb335570c4115b65b72d5a000c33df7
│  │  │  ├─ a9705f9955de2bcf7d8ed895b38c4f30d4079a
│  │  │  ├─ a9b692d9052b411e4be1bc1884d323a9d2f22d
│  │  │  └─ fc7851b52eb6116ae407c1b831b336b61a6a25
│  │  ├─ fb
│  │  │  ├─ 712430d72587af79caa71213c1e6d4010aa3f2
│  │  │  └─ e0ed15555fef0b6dc72de53d7fb05e4f5dadc9
│  │  ├─ fc
│  │  │  ├─ 0d3c4a4cd7691b843470cd55dfa62d3596aebe
│  │  │  └─ 7997cc07b52e25faaf766597d5ccb296021610
│  │  ├─ fd
│  │  │  ├─ 4cd6b01d0e6abcc3cb9d6965771637acee4d0d
│  │  │  └─ a7789e50fc900f8fd5be7c643f5627d4631d9b
│  │  ├─ fe
│  │  │  ├─ 35d1490be1af53ff1b3e79810f0f329f3e9163
│  │  │  └─ 4152b9164ca440f162c2940fa758b0302b490c
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
│  ├─ modules.xml
│  ├─ shelf
│  │  ├─ Uncommitted_changes_before_Update_at_24_08_2024_21_57_[Changes]
│  │  │  └─ shelved.patch
│  │  ├─ Uncommitted_changes_before_Update_at_24_08_2024_21_57__Changes_.xml
│  │  ├─ Uncommitted_changes_before_Update_at_24_08_2024_22_06_[Changes]
│  │  │  └─ shelved.patch
│  │  ├─ Uncommitted_changes_before_Update_at_24_08_2024_22_06__Changes_.xml
│  │  ├─ Uncommitted_changes_before_Update_at_25_08_2024_21_38_[Changes]
│  │  │  └─ shelved.patch
│  │  ├─ Uncommitted_changes_before_Update_at_25_08_2024_21_38__Changes_.xml
│  │  ├─ Uncommitted_changes_before_Update_at_26_08_2024_0_17_[Changes]
│  │  │  └─ shelved.patch
│  │  └─ Uncommitted_changes_before_Update_at_26_08_2024_0_17__Changes_.xml
│  ├─ uiDesigner.xml
│  ├─ vcs.xml
│  └─ workspace.xml
├─ api-gateway-microservice
│  ├─ pom.xml
│  └─ src
│     ├─ main
│     │  ├─ java
│     │  │  └─ gateway
│     │  │     ├─ ApiGateWayMicroservice.java
│     │  │     └─ user
│     │  │        ├─ User.java
│     │  │        ├─ UserController.java
│     │  │        ├─ UserDto.java
│     │  │        ├─ UserMapper.java
│     │  │        ├─ UserRep.java
│     │  │        ├─ UserRepository.java
│     │  │        ├─ UserRepositoryCustom.java
│     │  │        ├─ UserRepositoryCustomImpl.java
│     │  │        ├─ UserService.java
│     │  │        └─ UserState.java
│     │  └─ resources
│     │     └─ application.properties
│     └─ test
│        └─ java
├─ discovery-microservice
│  ├─ pom.xml
│  └─ src
│     ├─ main
│     │  ├─ java
│     │  │  └─ common
│     │  │     └─ discovery
│     │  │        ├─ DiscoveryMicroservice.java
│     │  │        └─ kafka
│     │  │           ├─ KafkaConfiguration.java
│     │  │           └─ KafkaProducer.java
│     │  └─ resources
│     │     └─ application.properties
│     └─ test
│        └─ java
├─ items-microservice
│  ├─ pom.xml
│  └─ src
│     ├─ main
│     │  ├─ java
│     │  │  └─ common
│     │  │     └─ laterapp
│     │  │        ├─ item
│     │  │        │  ├─ Item.java
│     │  │        │  ├─ ItemController.java
│     │  │        │  ├─ ItemDto.java
│     │  │        │  ├─ ItemRep.java
│     │  │        │  ├─ ItemRepository.java
│     │  │        │  └─ ItemService.java
│     │  │        ├─ ItemMicroservice.java
│     │  │        ├─ kafka
│     │  │        │  └─ KafkaProducer.java
│     │  │        └─ user
│     │  │           └─ UserDto.java
│     │  └─ resources
│     │     └─ application.properties
│     └─ test
│        └─ java
├─ Later_app.iml
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
└─ users-microservice
   ├─ pom.xml
   └─ src
      ├─ main
      │  ├─ java
      │  │  └─ common
      │  │     ├─ kafka
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
      │  │     └─ UsersMicroservice.java
      │  └─ resources
      │     └─ application.properties
      └─ test
         └─ java

```