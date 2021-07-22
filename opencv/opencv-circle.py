import cv2, numpy

pic = numpy.zeros((500, 500, 3), dtype='uint8')

cv2.circle(pic, (250, 250), 100, (240, 0, 240))

cv2.imshow('Circle', pic)
cv2.waitKey(0)
cv2.destroyAllWindows()