# 7.2 Manejo de logging
import logging as log

#llamamos  una configuracin basica
if __name__== '__main__':
    log.basicConfig(level=log.DEBUG)
    # video 2
    log.debug('Mensaje a nivel debug')
    log.info('Mensaje a nivel info')
    log.warning('Mensaje a nivel warning')
    log.error('Mensaje a nivel error')
    log.critical('Mensaje a nivel critical')
