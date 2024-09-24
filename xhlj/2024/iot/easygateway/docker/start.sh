#!/bin/sh

echo "fake_passwd" > /tmp/passwd ; chmod 777 /tmp/passwd

while true;
do
    /home/ctf/qemu-arm-static -L /home/ctf/ /home/ctf/boa -f /home/ctf/boa.conf -c /home/ctf/html | su - ctf
    sleep 2
done
# sleep infinity;