import cv2, numpy

pic = numpy.zeros((500, 500, 3), dtype='uint8')

cv2.rectangle(pic, (0, 0), (500, 250), (240, 0, 240), thickness=5, lineType=6, shift=0)

cv2.imshow('Rectangle', pic)
cv2.waitKey(0)
cv2.destroyAllWindows()