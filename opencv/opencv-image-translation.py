import cv2, numpy

img = cv2.imread('flower.png')
columns = img.shape[1]
rows = img.shape[0]

transformation_matrix = numpy.float32([[1, 0, 200], [0, 1, 100]])
transformed_image = cv2.warpAffine(img, transformation_matrix, (columns, rows))

cv2.imshow('Image', transformed_image)
cv2.waitKey(0)
cv2.destroyAllWindows()