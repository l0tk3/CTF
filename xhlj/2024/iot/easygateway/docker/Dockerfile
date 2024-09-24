FROM ubuntu:22.04

RUN apt-get update
RUN apt-get install -y curl

RUN useradd -m ctf

WORKDIR /home/ctf
COPY ./files/flag /
COPY ./files/mime.types /etc/mime.types
COPY ./start.sh /start.sh
COPY ./files/src/ /home/ctf/
COPY ./files/lib/ /home/ctf/lib/


RUN chmod +x /start.sh && \
    chown -R root:ctf /home/ctf && \
    chmod -R 750 /home/ctf && \
    chmod 444 /flag &&\
    mkdir -p /var/log/boa ; touch /var/log/boa/access_log ; touch /var/log/boa/error_log &&\
    chmod -R 777 /var/log/boa/
CMD ["/start.sh"]

EXPOSE 8088